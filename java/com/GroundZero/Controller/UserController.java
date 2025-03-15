package com.GroundZero.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GroundZero.DTO.UserDTO;
import com.GroundZero.Services.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
@Tag(name="User Controller", description="Operation related User")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/register")
	public ResponseEntity<UserDTO> createUser(@Valid @RequestBody UserDTO userDto){
		UserDTO create= this.userservice.createUser(userDto);
		return new ResponseEntity<>(create,HttpStatus.CREATED);
	}
	
	@PutMapping("/{userid}")
	public ResponseEntity<UserDTO>updateUser(@Valid @RequestBody UserDTO userDto, @PathVariable("userid") int uid){
		UserDTO updateDto= this.userservice.updateUser(userDto, uid);
		return ResponseEntity.ok(updateDto);
	}
	
    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(this.userservice.getAllUser());
    }
    
    @DeleteMapping("/{userid}")
    public ResponseEntity<?>deleteUser(@PathVariable int userid){
    	userservice.deleteUser(userid);
    	return new ResponseEntity<>(Map.of("message","User Deleted Successfully"),HttpStatus.OK);
    	
    }

}
