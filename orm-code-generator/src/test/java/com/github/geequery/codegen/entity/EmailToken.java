package com.github.geequery.codegen.entity;

import javax.persistence.Table;
import jef.database.DataObject;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
import jef.codegen.support.NotModified;
/**
 * This class was generated by JEF according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 */
@NotModified
@Entity
@Table(name="email_token")
public class EmailToken extends DataObject{


	@Id
	@Column(name="id",columnDefinition="char(12)",length=12,nullable=false)
	private String id;

	@Column(name="email",columnDefinition="varchar(45)",length=45,nullable=false)
	private String email;

	@Column(name="isUsed",columnDefinition="boolean default '0'",nullable=false)
	private Boolean isused;

	@Column(name="createtime",columnDefinition="timestamp",nullable=false)
	private Date createtime;

	@Column(name="token",columnDefinition="char(32)",length=32,nullable=false)
	private String token;

	public void setId(String obj){
		this.id = obj;
	}

	public String getId(){
		return id;
	}

	public void setEmail(String obj){
		this.email = obj;
	}

	public String getEmail(){
		return email;
	}

	public void setIsused(Boolean obj){
		this.isused = obj;
	}

	public Boolean getIsused(){
		return isused;
	}

	public void setCreatetime(Date obj){
		this.createtime = obj;
	}

	public Date getCreatetime(){
		return createtime;
	}

	public void setToken(String obj){
		this.token = obj;
	}

	public String getToken(){
		return token;
	}

	public EmailToken(){
	}

	public EmailToken(String id){
		this.id = id;
	}


   public enum Field implements jef.database.Field{id,email,isused,createtime,token}
}