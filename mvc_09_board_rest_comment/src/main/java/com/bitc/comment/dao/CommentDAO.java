package com.bitc.comment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bitc.comment.vo.CommentVO;

public interface CommentDAO {
	
	@Insert("INSERT INTO tbl_comment(bno, commentAuth, commentText) "
		   +" VALUES(#{bno}, #{commentAuth}, #{commentText})")
	int add(CommentVO vo)throws Exception;

	@Select("SELECT * FROM tbl_comment WHERE bno = #{bno} ORDER BY cno DESC")
	List<CommentVO> commentList(int bno) throws Exception;

	@Update("UPDATE tbl_comment SET "
			+ " commentAuth = #{commentAuth}, "
			+ " commentText = #{commentText}, "
			+ " updatedate = now() "
			+ " WHERE cno = #{cno}")
	int update(CommentVO vo) throws Exception;

}





