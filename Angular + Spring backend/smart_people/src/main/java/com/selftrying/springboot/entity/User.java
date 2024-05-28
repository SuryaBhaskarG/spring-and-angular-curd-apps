package com.selftrying.springboot.entity;

import com.selftrying.springboot.model.Gender;
import com.selftrying.springboot.model.Skill;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import com.selftrying.springboot.model.Department;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SMART_People")
public class User 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(name="User_Name")
	private String UserName;
	
	@Lob
	@Column(name="There_Image")
    private byte[] Image;
	
	@Column(name="How_I_Know_THEM")
	private String How_I_Know_THEM;
	
	@Column(name="Gender")
	private Gender Gender;
	
	@Column(name="Adhar_Number")
	private Long AdharNo;
	
	@Column(name="College_Id")
	private String CollegeId;
	
	@Column(name="Department_name")
	private Department Department;
	
	@Column(name="In_whichYear_when_i_know_Them")
	private int In_whichYear_when_i_know_Them;
	
	@Column(name="Clg_Email")
	private String EmailClg;
	
	@Column(name="Personal_Email")
	private String EmailPersonal;
	
	@Column(name="His_phoneNo")
	private long His_phoneNo;
	
	@Column(name="His_Father_phoneNo")
	private long His_Father_phoneNo;
	
	
	@Column(name="List_of_Skills")
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Skill> skills;
	
	
	@Column(name="There_Character")
	private String Character;
	
	@Column(name="What_make_them_Special")
	private String What_make_them_Special;
	
	
	
}
