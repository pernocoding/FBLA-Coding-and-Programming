package org.fbla_pbl.pernod.coding_programming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class UserManager {
	
	public static String path = "userData.json";
	
	public static List<User> getUserData() {
		String json = getJSON();
		Type usersType = new TypeToken<List<User>>() {}.getType();
		List<User> users = new Gson().fromJson(json, usersType);
		return users;
	}
	
	public static void updateUserData(User oldUser, User newUser) throws IOException {
		List<User> users = getUserData();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getEmail().equals(oldUser.getEmail())) {
				users.set(i, newUser);
				break;
			}
		}
		setJSON(users);
	}
	
	public static User findUser(String email) throws IOException {
		List<User> users = getUserData();
		for (User user : users) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}
	
	public static void deleteUser(User user) throws IOException {
		List<User> users = getUserData();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getEmail().equals(user.getEmail())) {
				users.remove(i);
				break;
			}
		}
		setJSON(users);
	}
	
	public static void registerUser(User user) throws IOException {
		List<User> users = getUserData();
		users.add(user);
		setJSON(users);
	}
	
	public static User createUser(String name, String grade, String email, String number) throws NoSuchAlgorithmException, InvalidKeySpecException {

		User user = new User();
		user.setName(name);
		user.setGrade(grade);
		user.setEmail(email);
		user.setNumber(number);
		user.setServiceHours(0);
		user.setAwards(new ArrayList<String>());
		return user;
	}
	
	public static void setJSON(List<User> users) throws IOException {
		Type usersType = new TypeToken<List<User>>() {}.getType();
		String newJSON = new Gson().toJson(users, usersType);
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
	    writer.write(newJSON);
	    writer.close();
	}

	public static String getJSON() {
		try {
			String json = new String(Files.readAllBytes(Paths.get(path)));
			return json;
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}
}

class User {
	private String name;
	private String grade;
	private String email;
	private String number;
	private int serviceHours;
	private List<String> awards;
	
	public String getName() { return name; }
	public String getGrade() { return grade; }
	public String getEmail() { return email; }
	public String getNumber() { return number; }
	public int getServiceHours() { return serviceHours; }
	public List<String> getAwards() { return awards; }
	
	public void setName(String name) { this.name = name; }
	public void setGrade(String grade) { this.grade = grade; }
	public void setEmail(String email) { this.email = email; }
	public void setNumber(String number) { this.number = number; }
	public void setServiceHours(int serviceHours) { this.serviceHours = serviceHours; }
	public void setAwards(List<String> awards) { this.awards = awards; }
}