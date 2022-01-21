package com.xworkz.entity.DAO;

import java.util.List;

import com.xworkz.website.WebsiteEntity;

public interface WebsiteDAO {

	public void save(WebsiteEntity websiteEntity14);

	WebsiteEntity getByNameGoogle(WebsiteEntity entity);

	WebsiteEntity getByLinkUrlx(WebsiteEntity enWebsiteEntity);

	WebsiteEntity getByMinSince(WebsiteEntity enWebsiteEntity);

	WebsiteEntity getByMaxSince(WebsiteEntity enWebsiteEntity);
}
