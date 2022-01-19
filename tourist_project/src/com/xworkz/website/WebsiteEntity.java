package com.xworkz.website;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "website")
@NamedQueries({
		@NamedQuery(name = "getByNameGoogle", query = "select web from WebsiteEntity web where web.name ='getByNameGoogle'"),
		@NamedQuery(name = "getByLikeUrlx", query = "select web from WebsiteEntity web where web.url like 'www.x%'"),
		@NamedQuery(name="getByMinSince",query="select max(since) AS MAXIMUMSINCE FROM WebsiteEntity"),
		@NamedQuery(name="getByMaxSince",query="select min(since) AS MINIMUMSINCE FROM WebsiteEntity"),
		@NamedQuery(name="getBySecondMinSince",query="Select since,max(since)  from WebsiteEntity where since in(select max(since) from WebsiteEntity "),
		@NamedQuery(name="getBySecondMaxSince",query="Select since,min(since)  from WebsiteEntity where since in(select min(since) from WebsiteEntity"),
		
})
public class WebsiteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "w_id")
	private int wid;
	@Column(name = "w_name")
	private String name;
	@Column(name = "w_url")
	private String url;
	@Column(name = "w_since")
	private int since;
	@Column(name = "w_owner")
	private String owner;
	@Column(name = "w_domain")
	private String domain;

	public WebsiteEntity() {

	}

	public WebsiteEntity(String name, String url, int since, String owner, String domain) {
		super();

		this.name = name;
		this.url = url;
		this.since = since;
		this.owner = owner;
		this.domain = domain;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "WebsiteEntity [wid=" + wid + ", name=" + name + ", url=" + url + ", since=" + since + ", owner=" + owner
				+ ", domain=" + domain + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + since;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + wid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WebsiteEntity other = (WebsiteEntity) obj;
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (since != other.since)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (wid != other.wid)
			return false;
		return true;
	}

}
