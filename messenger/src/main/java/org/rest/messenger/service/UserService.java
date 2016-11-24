package org.rest.messenger.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.rest.messenger.model.User;

public class UserService {
	
	public List<User> getUserDetail(){
		BufferedReader br = null;
		List<User> userList = new ArrayList<User>();
		try{
			br = new BufferedReader(new FileReader("D:\\userdetails.txt"));
			 String contentLine = br.readLine();
			   while (contentLine != null) {
			      System.out.println(contentLine);
			      String[] data =  contentLine.split(",");
			      User u = new User(Integer.parseInt(data[0]), data[1], data[2], data[3]);
			      userList.add(u);
			      contentLine = br.readLine();
			   }
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}
	
	public File getUserInfo(){
		File file = null;
		try{
			file = new File("D:\\userdetails.txt");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return file;
	}

}
