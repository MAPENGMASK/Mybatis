package cn.com.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import cn.com.Interface.Dao;
import cn.com.entity.User;
import cn.com.util.MybatisUtil;

public class UserDao implements Dao{
	public List<User> getAll(int currentPage,int pageSize) throws IOException{
		SqlSession session = MybatisUtil.getSession();
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("startIndex",(currentPage - 1)*pageSize );
		map.put("pageSize", pageSize);
		List<User> list = session.selectList("cn.com.entity.UserMapper.selectAll",map);
		//List<User> list = session.getMapper(Dao.class); 注解方式，动态代理
		session.close();
		return list;
	}
	public User getById(int id) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		User user = session.selectOne("cn.com.entity.UserMapper.selectUser", id);
		session.close();
		return user;
	}
	public int add(User user) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		int result = session.insert("cn.com.entity.UserMapper.addUser", user);
		session.commit();
		session.close();
		return result;
	}
	public int update(User user) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		int result = session.update("cn.com.entity.UserMapper.updateUser", user);
		session.commit();
		session.close();
		return result;
	}
	public int delete(int id) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		int result = session.delete("cn.com.entity.UserMapper.deleteUser", id);
		session.commit();
		session.close();
		return result;
	}

}
