package com.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usr")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private boolean modi;
    private boolean gurs;
    private boolean elim;
    private boolean repo;
    private boolean ver;

    public Usuario() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isModi() {
		return modi;
	}

	public void setModi(boolean modi) {
		this.modi = modi;
	}

	public boolean isGurs() {
		return gurs;
	}

	public void setGurs(boolean gurs) {
		this.gurs = gurs;
	}

	public boolean isElim() {
		return elim;
	}

	public void setElim(boolean elim) {
		this.elim = elim;
	}

	public boolean isRepo() {
		return repo;
	}

	public void setRepo(boolean repo) {
		this.repo = repo;
	}

	public boolean isVer() {
		return ver;
	}

	public void setVer(boolean ver) {
		this.ver = ver;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", modi=" + modi + ", gurs="
				+ gurs + ", elim=" + elim + ", repo=" + repo + ", ver=" + ver + "]";
	}

    
}
