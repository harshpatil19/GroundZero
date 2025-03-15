package com.GroundZero.Services;

import java.util.List;

import com.GroundZero.DTO.CommentDTO;

public interface CommentsService {
	CommentDTO createComment(CommentDTO commentDto, Integer turfid, Integer userid);

	void deleteComment(Integer commentid);

	List<CommentDTO> getCommentsByPost(Integer turfid);

	CommentDTO updateComment(Integer commentid, CommentDTO commentDto);
}
