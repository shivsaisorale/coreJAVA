package com.xworkz.array;

public class PhoneNumber {

	public static void main(String[] args) {

		long kiran = 8139966651L;
		long bassu = 8139966652L;
		long sangu = 8139966653L;
		long sagar = 9234567834L;
		long sai = 9080605430L;
		long shivu = 9004082090L;

		long[] phoneNo = { kiran, bassu, sagar, sai, sangu, shivu, 9343721317L, 9243215180L, 98765433265L, 8846366733L,
				2873636373L };

		System.out.println("kiran:" + kiran);
		System.out.println("bassu" + bassu);
		System.out.println("sagar" + sagar);
		System.out.println("sai" + sai);
		System.out.println("sangu" + sangu);
		System.out.println("shivu" + shivu);

		long num = phoneNo[6];
		System.out.println("change the number" + num);
		phoneNo[7] = 9845878743L;
		long num1 = phoneNo[7];
		System.out.println("change sangu number:" + num1);
		phoneNo[8] = 9845878643L;
		long num2 = phoneNo[8];
		System.out.println("change bassu number" + num2);
		phoneNo[9] = 9845878749L;
		long num3 = phoneNo[9];
		System.out.println("change sagar number" + num3);
		phoneNo[10] = 9845838743L;
		long num4 = phoneNo[10];
		System.out.println("change kiran number" + num4);
		
		
		// pincode
		int Bengaluru = 530068;
		int ballary = 591216;
		int mandya = 573537;
		int gadag = 591214;
		int belgavi = 591208;
		int bidar = 585403;

		int[] pincode = { Bengaluru, ballary, mandya, gadag, belgavi, bidar, 560003, 560002, 560001, 560006, 585065,
				585096, 585093 };

		System.out.println("Bengaluru:" + Bengaluru);
		System.out.println("ballary" + ballary);
		System.out.println("mandya" + mandya);
		System.out.println("gadag" + gadag);
		System.out.println("belgavi" + belgavi);
		System.out.println("bidar" + bidar);

		int num8 = pincode[6];
		System.out.println("change the number" + num8);
		pincode[7] = 585604;
		int num9 = pincode[7];
		System.out.println("change bidar number:" + num9);
		pincode[8] = 585405;
		int num11 = pincode[8];
		System.out.println("change belgavi number" + num11);
		pincode[9] = 585406;
		int num33 = pincode[9];
		System.out.println("change gadag number" + num33);
		pincode[10] = 585408;
		int num13 = pincode[10];
		System.out.println("change mandya number" + num13);
		

		// aadhar
		long raju = 123339966651L;
		long rani = 3445966652L;
		long vinu = 34559966653L;
		long kitti = 9232567834L;
		long mahesh= 90823445430L;
		long mahi = 33404082090L;

		long[] aadharNo = { raju,rani,vinu,kitti,mahesh,mahi, 43239343721317L,2339243215180L, 2398765433265L,
				2338846366733L, 232873636373L };

		System.out.println("raju" + raju);
		System.out.println("rani" + rani);
		System.out.println("vinu" + vinu);
		System.out.println("kitti" + kitti);
		System.out.println("maheh" + mahesh);
		System.out.println("mahi" + mahi);

		long card = aadharNo[6];
		System.out.println("change the number" + card);
		aadharNo[7] = 9845878743L;
		long card1 = aadharNo[7];
		System.out.println("change raju number:" + card1);
		aadharNo[8] = 9845878643L;
		long card2 = aadharNo[8];
		System.out.println("change rani number" + card2);
		aadharNo[9] = 9845878749L;
		long card3 = aadharNo[9];
		System.out.println("change kitti number" + card3);
		aadharNo[10] = 9845838743L;
		long card4 = aadharNo[10];
		System.out.println("change mahi number" + card4);

		//bank
		long rakesh = 123339966651L;
		long gomu = 3445966652L;
		long abhi = 34559966653L;
		long guru = 9232567834L;
		long satya = 90823445430L;
		long kashappa = 33404082090L;

		long[] bankAcc = { rakesh, gomu, abhi, guru, satya, kashappa, 43239343721317L, 2339243215180L,
				2398765433265L, 2338846366733L, 232873636373L };

		System.out.println("rakesh:" + rakesh);
		System.out.println("gomu" + gomu);
		System.out.println("abhi" + abhi);
		System.out.println("guru" + guru);
		System.out.println("kashappa" + kashappa);
		System.out.println("satya" + satya);

		long Anum = bankAcc[6];
		System.out.println("change the number" + num);
		bankAcc[7] = 9845878743L;
		long Anum1 = bankAcc[7];
		System.out.println("change rakesh number:" + num1);
		bankAcc[8] = 9845878643L;
		long Anum2 = bankAcc[8];
		System.out.println("change gomu number" + num2);
		bankAcc[9] = 9845878749L;
		long Anum3 = bankAcc[9];
		System.out.println("change abhi number" + num3);
		bankAcc[10] = 9845838743L;
		long Anum4 = bankAcc[10];
		System.out.println("change guru number" + num4);
		
		//orderID
		long orderID1 = 130068L;
		long orderID2 = 291216L;
		long orderID3 = 33537L;
		long orderID4 = 51214L;
		long orderID5 = 691208L;
		long orderID6 = 54303L;

		long[] orderID = { orderID1, orderID2, orderID3, orderID4, orderID5, orderID6, 561203L, 35460002L, 44560001L,
				233560006L};

		System.out.println("orderID1" + orderID1);
		System.out.println("orderID2" + orderID2);
		System.out.println("orderID3" + orderID3);
		System.out.println("orderID4" + orderID4);
		System.out.println("orderID5" + orderID5);
		System.out.println("orderID6" + orderID6);

		long Onum = orderID[6];
		System.out.println("change the number" +Onum);
		orderID[7] = 558743L;
		long Onum1 = orderID[7];
		System.out.println("change orderID1 number:" +Onum1);
		orderID[8] = 4555643L;
		long Onum2 = orderID[8];
		System.out.println("change orderID2 number" +Onum2);
		orderID[9] = 24478749L;
		long Onum3 = orderID[9];
		System.out.println("change orderID4 number" +Onum3);
		/*orderID[10] = 545743L;
		long Onum4 = orderID[10];
		System.out.println("change orderID5 number" + Onum4);*/

		//markscard
		long karan = 34966651L;
		long pravin = 9966652L;
		long pavan = 3466653L;
		long sagu = 34567834L;
		long sanju = 244605430L;
		long mangu = 2082090L;

		long[] MarkscardNum = { karan, pravin, pavan, sagu, sanju, mangu, 721317L, 3215180L, 65433265L, 46366733L,
				3636373L };

		System.out.println("karan:" + karan);
		System.out.println("pravin" + pravin);
		System.out.println("pavan" + pavan);
		System.out.println("sagu" + sagu);
		System.out.println("sanju" + sanju);
		System.out.println("mangu" + mangu);

		long CARD = MarkscardNum[6];
		System.out.println("change the number" + CARD);
		MarkscardNum[7] = 9845878743L;
		long CARD1 = MarkscardNum[7];
		System.out.println("change mangu number:" + CARD1);
		MarkscardNum[8] = 9845878643L;
		long CARD2 = MarkscardNum[8];
		System.out.println("change pravin number" + CARD2);
		MarkscardNum[9] = 9845878749L;
		long CARD3 = MarkscardNum[9];
		System.out.println("change sagu number" + CARD3);
		MarkscardNum[10] = 9845838743L;
		long CARD4 = MarkscardNum[10];
		System.out.println("change mangu number" + CARD4);

		//ROLLNUM
		long Rollnum1 = 349L;
		long Rollnum2 = 992L;
		long Rollnum3 = 343L;
		long Rollnum4 = 345L;
		long Rollnum5 = 430L;
		long Rollnum6 = 200L;

		long[] RollNum = { Rollnum1, Rollnum2, Rollnum3, Rollnum4, Rollnum5, Rollnum6, 727L, 320L, 659L, 733L, 973L };

		System.out.println("Rollnum1:" + Rollnum1);
		System.out.println("Rollnum2" + Rollnum2);
		System.out.println("Rollnum3" + Rollnum3);
		System.out.println("Rollnum4" + Rollnum4);
		System.out.println("Rollnum5" + Rollnum5);
		System.out.println("Rollnum6" + Rollnum6);

		long Rnum = RollNum[6];
		System.out.println("change the number" +Rnum);
		RollNum[7] = 9845878743L;
		long Rnum1 = RollNum[7];
		System.out.println("change Rollnum1 number:" +Rnum1);
		RollNum[8] = 9845878643L;
		long Rnum2 = RollNum[8];
		System.out.println("change Rollnum3 number" +Rnum2);
		RollNum[9] = 9845878749L;
		long Rnum3 = RollNum[9];
		System.out.println("change Rollnum4 number" +Rnum3);
		RollNum[10] = 9845838743L;
		long Rnum4 = RollNum[10];
		System.out.println("change Rollnum6 number" +Rnum4);

		
		
		int HA1 = 349;
		int HA2 = 992;
		int HA3 = 343;
		int HA4 = 345;
		int HA5 = 430;
		int HA6 = 200;

		int[] HomeNum = { HA1, HA2, HA3, HA4, HA5, 727, 320, 659, 733, 973 };

		System.out.println("HA1:" + HA1);
		System.out.println("HA2" + HA2);
		System.out.println("HA3" + HA3);
		System.out.println("HA5" + HA5);
		System.out.println("HA4" + HA4);
		System.out.println("HA6" + HA6);

		int Hnum = HomeNum[6];
		System.out.println("change the number" + Hnum);
		HomeNum[7] = 983;
		int Hnum1 = HomeNum[7];
		System.out.println("change HA2 number:" + Hnum1);
		HomeNum[8] = 984;
		int Hnum2 = HomeNum[8];
		System.out.println("change HA3 number" + Hnum2);
		HomeNum[9] = 989;
		int Hnum3 = HomeNum[9];
		System.out.println("change HA5 number" + Hnum3);
		/*HomeNum[10] = 743;
		int Hnum4 = HomeNum[10];
		System.out.println("change HA4 number" + Hnum4);*/

	}
}
