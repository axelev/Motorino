package it.consoft.nameless.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class MotoComposta {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "motoId")
	private Moto moto;

	private Set<Componente> listComponenti;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	public Set<Componente> getListComponenti() {
		return listComponenti;
	}

	public void setListComponenti(Set<Componente> listComponenti) {
		this.listComponenti = listComponenti;
	}

	@Override
	public String toString() {
		return "MotoComposta [id=" + id + ", user=" + user + ", moto=" + moto + ", listComponenti=" + listComponenti
				+ "]";
	}

}
