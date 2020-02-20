package cn.com.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import cn.com.entity.Teacher;
import cn.com.util.MybatisUtil;

public class TeacherDao {
	public Teacher getTeacher(int id) throws IOException{
		SqlSession session = MybatisUtil.getSession();
		Teacher teacher = session.selectOne("cn.com.entity.teacher.mapper.getTeacher",id);
		session.close();
		return teacher;
	}
	
}
