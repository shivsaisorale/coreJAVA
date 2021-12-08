package com.xworkz.facebook;

import com.xworkz.facebook.appliction.FacebookApplictionDTO;
import com.xworkz.facebook.appliction.InstagramApplictionDTO;

public class ApplictionDAO {

	private FacebookApplictionDTO[] facebook =new FacebookApplictionDTO[5];
	private InstagramApplictionDTO[] instagram=new InstagramApplictionDTO[5];
	private int dex = 0;
	
		public FacebookApplictionDTO[] getFacebook() {
			return facebook;			
		}

	public InstagramApplictionDTO[] getInstagram() {
		return instagram;		
	}
	
	public void save(FacebookApplictionDTO faceBook1) {
		System.out.println("Invoked save method to save facebook");
		if(this.dex<this.facebook.length&& faceBook1 !=null) {
			this.facebook[this.dex]=faceBook1;
		}else {
			System.err.println("either you passing null or array is full");
		}
		
	}
	public void save(InstagramApplictionDTO insta) {
		System.out.println("Invoked save method to save instagram");
		if(this.dex<this.instagram.length&& insta !=null) {
			this.instagram[this.dex]=insta;
		}else {
			System.err.println("either you passing null or the array is full");
		}
	}
}
