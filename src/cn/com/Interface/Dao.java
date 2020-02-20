package cn.com.Interface;

import java.io.IOException;
import java.util.List;
import org.apache.ibatis.annotations.*;

import cn.com.entity.User;

public interface Dao {
	//@select("select * from user")
	public List<User> getAll(int currentPage,int pageSize) throws IOException;
	public User getById(int id) throws IOException;
	public int add(User user) throws IOException;
	public int update(User user) throws IOException;
	public int delete(int id) throws IOException;
}
