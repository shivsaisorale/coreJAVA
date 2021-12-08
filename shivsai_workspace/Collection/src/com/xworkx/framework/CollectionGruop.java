package com.xworkx.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionGruop {

	public static void main(String[] args) {

		String festival1 = "Holi";
		String festival2 = "Dasara";
		String festival3 = "Deepavali";
		String festival4 = "Ugadi";
		String festival5 = "Christmas";
		String festival6 = "New Year";
		String festival7 = "Sankranti";
		String festival8 = "Raksha Bandana";
		String festival9 = "Gowri Habba";
		String festival10 = "Durga Pooja";
		String festival11 = "Shivaratri";
		String festival12 = "Naraka Chaturdarshi";
		String festival13 = "Onam";
		String festival14 = "Ganesh Habba";
		String festival15 = "Navratri";
		String festival16 = "Baisakhi";
		String festival17 = "Gurpurab";
		String festival18 = "Easter";
		String festival19 = "Hemis";
		String festival20 = "Gangaur";
		String festival21 = "Hornbill";
		String festival22 = "Eid al-Adha";
		String festival23 = "Republic Day";
		String festival24 = "Durga Ashtami";
		String festival25 = "Rama NAVAMI";
		String festival26 = "kali Puje";
		String festival27 = "Bihu";
		String festival28 = "Mahavir Jayanti";
		String festival29 = "Ambedkar Jayanti";
		String festival30 = "Hanuman Jayanti";
		String festival31 = "Karthika Deepam";
		String festival32 = "Chhatrapati Shivaji Jayanti";
		String festival33 = "Republic Day";
		String festival34 = "Bddha Jayanti";
		String festival35 = "Gandhi Jayanti";
		String festival36 = "kanaka Jayanti";
		String festival37 = "Basava Jayanti";
		String festival38 = "Lohri";
		String festival39 = "Independence Day";
		String festival40 = "Rath Yatra";
		String festival41 = "Ramzan";
		String festival42 = "Kumbhmela";
		String festival43 = "Nagara Panchami";
		String festival44 = "Bhishma Ekadasi";
		String festival45 = "Losar";
		String festival46 = "Bakari";
		String festival47 = "Easter";
		String festival48 = "Moharam";
		String festival49 = "Karnataka Rajyostava";
		String festival50 = "ella Amavase";
		String festival51 = "Khar Hunnime";
		String festival52 = "Bhimana Amavase";
		String festival53 = "Children's Day";
		String festival54 = "Teacher's Day";
		String festival55 = "Bihu";
		String festival56 = "Karva Chauth";
		String festival57 = "Good Fridsay";
		String festival58 = "Pongal";
		String festival59 = "Bhaidooj";
		String festival60 = "Varmahalaxmi";

		Collection<String> collection = new ArrayList<String>();
		collection.add(festival1);
		collection.add(festival2);
		collection.add(festival3);
		collection.add(festival4);
		collection.add(festival5);
		collection.add(festival6);
		collection.add(festival7);
		collection.add(festival8);
		collection.add(festival9);
		collection.add(festival10);
		collection.add(festival11);
		collection.add(festival12);
		collection.add(festival14);
		collection.add(festival13);
		collection.add(festival15);
		collection.add(festival16);
		collection.add(festival17);
		collection.add(festival18);
		collection.add(festival19);
		collection.add(festival20);
		collection.add(festival21);
		collection.add(festival22);
		collection.add(festival23);
		collection.add(festival24);
		collection.add(festival25);
		collection.add(festival26);
		collection.add(festival27);
		collection.add(festival28);
		collection.add(festival29);
		collection.add(festival31);
		collection.add(festival32);
		collection.add(festival33);
		collection.add(festival34);
		collection.add(festival35);
		collection.add(festival36);
		collection.add(festival37);
		collection.add(festival38);
		collection.add(festival39);
		collection.add(festival40);
		collection.add(festival51);
		collection.add(festival52);
		collection.add(festival53);
		collection.add(festival54);
		collection.add(festival55);
		collection.add(festival56);
		collection.add(festival57);
		collection.add(festival58);
		collection.add(festival59);
		collection.add(festival60);
		System.out.println("festival size:" + collection.size());
		System.out.println(collection);
		Iterator<String> it77 = collection.iterator();
		while (it77.hasNext()) {
			System.out.println(it77.next());

			boolean check1 = collection.remove(festival59);
			System.out.println(check1);

			boolean checkout1 = collection.contains(festival57);
			System.out.println(checkout1);

			boolean contained1= collection.isEmpty();
			System.out.println(contained1);

			collection.clear();
			System.out.println("After clearing");
		}

		Collection<String> collection2 = new ArrayList<String>();
		collection2.add("Punneth");
		collection2.add("Rajakumar");
		collection2.add("Gange");
		collection2.add("Yuva Raju");
		collection2.add("Dharshan");
		collection2.add("Vinod");
		collection2.add("Ramesh");
		collection2.add("Ramya");
		collection2.add("Suddep");
		collection2.add("Milana");
		collection2.add("Upendra");
		collection2.add("Keanu Reeves");
		collection2.add("Aleksandër Moisiu ");
		collection2.add("Anant ");
		collection2.add("rakshita");
		collection2.add("Ahsaas Chann");
		collection2.add("Ahaana Krishna");
		collection2.add("Advani Lakshmi Devi");
		collection2.add("Aditi Sarangdhar");
		collection2.add("Aditi Rao Hydar");
		collection2.add("Aditi Govitrikar");
		collection2.add("Aditi Sharma");
		collection2.add("Aditi Ravi");
		collection2.add("Aditi Arya");
		collection2.add("Adah Sharma");
		collection2.add("Abhirami");
		collection2.add("Aashka Goradia");
		collection2.add("Aarti Chhabria");
		collection2.add("Aarti Agarwal");
		collection2.add("Aarathi");
		collection2.add("Aanchal Munjal");
		collection2.add("Aamna Sharif");
		collection2.add("Aakanksha Singh");
		collection2.add("Aahana Kumra");
		collection2.add("Aisha Sharma");
		collection2.add("Amoolya");
		collection2.add("Ameesha Patel");
		collection2.add("Jayanti");
		collection2.add("Prem");
		collection2.add("Amala Paul");
		collection2.add("Amala");
		collection2.add("Alaya Furniturewala");
		collection2.add("Alia Bhatt");
		collection2.add("Akshara Menon");
		collection2.add("Maduri");
		collection2.add("Akshara Gowda");
		collection2.add("Aksha Pardasany");
		collection2.add("Shruti");
		collection2.add("Aishwarya Sakhuja");
		collection2.add("Amulya");
		collection2.add("Pravati");
		collection2.add("Rasmika");
		collection2.add("Yash");
		collection2.add("Ragini");
		collection2.add("Chiru");
		collection2.add("Aishwarya");
		System.out.println("actors size:" + collection.size());
		System.out.println(collection2);

		Iterator<String> itr = collection2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			boolean check1 = collection2.remove("Chiru");
			System.out.println(check1);

			boolean checkout1 = collection2.contains("Yash");
			System.out.println(checkout1);

			boolean contained1 = collection2.isEmpty();
			System.out.println(contained1);

			collection.clear();
			System.out.println("After clearing");
		}

		Collection<String> collection3 = new ArrayList<String>();
		collection3.add("Kannada");
		collection3.add("english");
		collection3.add("Hindi");
		collection3.add("Tamil");
		collection3.add("tamil");
		collection3.add("urdu");
		collection3.add("Bengali");
		collection3.add("Gujarati");
		collection3.add("Spanish");
		collection3.add("Malayalam");
		collection3.add("Marati");
		collection3.add("Punjabi");
		collection3.add("Rajasthani");
		collection3.add("Tulu");
		collection3.add("Assamese");
		collection3.add("Maithili");
		collection3.add("Haryanvi");
		collection3.add("Khotta");
		collection3.add("Marwari");
		collection3.add("Santali");
		collection3.add("Kashmiri");
		collection3.add("khandi");
		collection3.add("Malvi");
		collection3.add("Sadri");
		collection3.add("Mewari");
		collection3.add("Wagdi");
		collection3.add("Lambadi");
		collection3.add("Bhilodi");
		collection3.add("Harauti");
		collection3.add("Nepali");
		collection3.add("Gondi");
		collection3.add("Baghel Khandi");
		collection3.add("Sambalpuri");
		collection3.add("Dogri");
		collection3.add("Garhwali");
		collection3.add("Nimadi");
		collection3.add("Surjapuri");
		collection3.add("Konkani");
		collection3.add("Kumauni");
		collection3.add("Oraon");
		collection3.add("Tulu");
		collection3.add("Manipuri");
		collection3.add("Surgujia");
		collection3.add("Sindhi");
		collection3.add("Bagri");
		collection3.add("Ahirani");
		collection3.add("Banjari");
		collection3.add("Brajbhasha");
		collection3.add("Dhundhari");
		collection3.add("Boro");
		collection3.add("Ho");
		collection3.add("Gujar");
		collection3.add("Mundari");
		collection3.add("Garo");
		collection3.add("Kangri");
		collection3.add("Kachchhi");
		collection3.add("Khasi");
		collection3.add("mara");
		collection3.add("nidi");
		collection3.add("sindu");
		System.out.println("language size:" + collection3.size());
		System.out.println(collection3);
		
		Iterator<String> it2 = collection3.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());

			boolean check2 = collection3.remove("sindu");
			System.out.println(check2);

			boolean checkout2 = collection3.contains("Kannada");
			System.out.println(checkout2);

			boolean contained2 = collection3.isEmpty();
			System.out.println(contained2);

			collection.clear();
			System.out.println("After clearing");
		}

		Collection<String> collection4 = new ArrayList<String>();
		collection4.add("AAke");
		collection4.add("Ajaramar");
		collection4.add("Tenet");
		collection4.add("Allama");
		collection4.add("Arivu");
		collection4.add("Ayana");
		collection4.add("Badami");
		collection4.add("BB5");
		collection4.add("Onward");
		collection4.add("Mulan");
		collection4.add("tanhaji");
		collection4.add("Tolo Tolo");
		collection4.add("The Grudge");
		collection4.add("Fantasy Island");
		collection4.add("Underwater");
		collection4.add("The New Mutants");
		collection4.add("Chowka");
		collection4.add("Like a Boss");
		collection4.add("College kumar");
		collection4.add("Crack");
		collection4.add("Deal");
		collection4.add("Gretel ");
		collection4.add("Scoob!");
		collection4.add("Brahms: The Boy II");
		collection4.add("Dhamaki");
		collection4.add("The Way Back");
		collection4.add("Dhawani");
		collection4.add("I Still Believe");
		collection4.add("The Hunt");
		collection4.add("Las Pildoras De Mi Novio");
		collection4.add("Haai");
		collection4.add("Sai");
		collection4.add("Cast Away");
		collection4.add("What Women Want");
		collection4.add("Dinosaur");
		collection4.add("How the Grinch Stole Christmas");
		collection4.add("Meet the Parents");
		collection4.add("The Perfect Storm");
		collection4.add("X-Men");
		collection4.add("kira");
		collection4.add("Avengers: Endgame");
		collection4.add("Star Wars: The Force Awakens");
		collection4.add("Huliya");
		collection4.add("Kaadal");
		collection4.add("Kemprive");
		collection4.add("The Avengers");
		collection4.add("Furious 7");
		collection4.add("Frozen II");
		collection4.add("Avengers: Age of Ultron");
		collection4.add("Black Panther");
		collection4.add("Harry Potter and the Deathly Hallows – Part 2");
		collection4.add("Star Wars: The Last Jedi");
		collection4.add("Jurassic World: Fallen Kingdom");
		collection4.add("Frozen");
		collection4.add("Kidi and the Beast");
		collection4.add("Incredibles 2");
		collection4.add("The Fate of the Furious");
		collection4.add("Iron Man 3");
		collection4.add("gita govida");
		collection4.add("comrade");
		System.out.println("movies size:" + collection4.size());
		System.out.println(collection4);

		Iterator<String> it4 = collection4.iterator();
		while (it4.hasNext()) {
			System.out.println(it4.next());

			boolean check3 = collection4.remove("Kaadal");
			System.out.println(check3);

			boolean checkout3 = collection4.contains("AAke");
			System.out.println(checkout3);

			boolean contained4 = collection4.isEmpty();
			System.out.println(contained4);

			collection.clear();
			System.out.println("After clearing");
		}

		Collection<String> collection5 = new ArrayList<String>();
		collection5.add("Money Heist");
		collection5.add("Titans");
		collection5.add("Inside edge");
		collection5.add("Lost in Edge");
		collection5.add("Hicups");
		collection5.add("Howkey");
		collection5.add("Coming Out");
		collection5.add("The special ops");
		collection5.add("The special ops1");
		collection5.add("The special ops2");
		collection5.add("The agents");
		collection5.add("Clutch");
		collection5.add("Succession");
		collection5.add("Clark and Michael");
		collection5.add("Chop Socky Boom");
		collection5.add("Childrens Hospital");
		collection5.add("Chelsea Does");
		collection5.add("Chelsea");
		collection5.add("Chateau Laurier");
		collection5.add("Chance");
		collection5.add("Chad Vader");
		collection5.add("CELL");
		collection5.add("Castlevania");
		collection5.add("Carpool Karaoke");
		collection5.add("Carmilla");
		collection5.add("Titans Season 3");
		collection5.add("Inside Edge Season 3");
		collection5.add("Lost in Space Season 3");
		collection5.add("Hiccups & Hookups");
		collection5.add("Hawkeye");
		collection5.add("Cowboy Bebop Season 1");
		collection5.add("The Wheel of Time");
		collection5.add("Star Trek: Discovery Season 4");
		collection5.add("Special Ops 1.5");
		collection5.add("Call My Agent: Bollywood");
		collection5.add("Little Things Season 4");
		collection5.add("Succession Season 3");
		collection5.add("House of Secrets: The Burari");
		collection5.add("Break Point");
		collection5.add("Foundation Season 1");
		collection5.add("Kota Factory Season 2");
		collection5.add("Star Wars: Visions Season 1");
		collection5.add("Squid Game Season 1");
		collection5.add("The Last Man Season 1");
		collection5.add("Mumbai Diaries 26/11");
		collection5.add("Money Heist Season 5");
		collection5.add("The Empire Season 1");
		collection5.add("What If…? Season 1");
		collection5.add("Feels Like Ishq Season 1");
		collection5.add("Ted Lasso Season 2");
		collection5.add("Never Have I Ever Season 2");
		collection5.add("Ray Season 1");
		collection5.add("Loki Season 1");
		collection5.add("The Family Man Season 2");
		collection5.add("kimit su yaiba");
		collection5.add("attack of taitan");
		collection5.add("lost in space");
		collection5.add("charnobly");
		collection5.add("dark");
		collection5.add("streger things");
		System.out.println("web series size:" + collection5.size());
		System.out.println(collection5);

		Iterator<String> it7 = collection5.iterator();
		while (it7.hasNext()) {
			System.out.println(it7.next());

			boolean check5 = collection5.remove("Money Heist");
			System.out.println(check5);

			boolean checkout5 = collection5.contains("AAke");
			System.out.println(checkout5);

			boolean contained5 = collection5.isEmpty();
			System.out.println(contained5);

			collection.clear();
			System.out.println("After clearing");
		}

		Collection<String> collection6 = new ArrayList<String>();
		collection6.add("Bidar");
		collection6.add("Bhalki");
		collection6.add("Gadag");
		collection6.add("Hydrabad");
		collection6.add("Hubbali");
		collection6.add("Mysuru");
		collection6.add("Aurad");
		collection6.add("bangloare");
		collection6.add("Ballari");
		collection6.add("kolkatta");
		collection6.add("Tumuru");
		collection6.add("punjab");
		collection6.add("Raichur");
		collection6.add("jaypur");
		collection6.add("Hosapete");
		collection6.add("patayya");
		collection6.add("goa");
		collection6.add("huballi");
		collection6.add("Bagalkote");
		collection6.add("dhule");
		collection6.add("Goa");
		collection6.add("raj kot");
		collection6.add("ahmdabad");
		collection6.add("gandhi nagar");
		collection6.add("surat");
		collection6.add("mumbai");
		collection6.add("rajpal");
		collection6.add("bhuneshwar");
		collection6.add("manglore");
		collection6.add("abu dabi");
		collection6.add("kolhapur");
		collection6.add("ichalkaranji");
		collection6.add("sangli");
		collection6.add("miraj");
		collection6.add("dharwad");
		collection6.add("shiratwad");
		collection6.add("nipani");
		collection6.add("chikurdi");
		collection6.add("ghokag");
		collection6.add("jamakahand");
		collection6.add("shirdi");
		collection6.add("gangapur");
		collection6.add("bhosawal");
		collection6.add("shirpur");
		collection6.add("airandol");
		collection6.add("jalgav");
		collection6.add("fagne");
		collection6.add("mannad");
		collection6.add("parbhani");
		collection6.add("latur");
		collection6.add("agra");
		collection6.add("ranchi");
		collection6.add("chiru");
		collection6.add("nepal");
		collection6.add("kolhar");
		collection6.add("kur");
		collection6.add("madkiri");
		collection6.add("virajpet");
		collection6.add("ooty");
		collection6.add("mandya");
		System.out.println("city name size:" + collection6.size());
		System.out.println(collection6);

		Iterator<String> it66 = collection6.iterator();
		while (it66.hasNext()) {
			System.out.println(it66.next());

			boolean check6 = collection6.remove("kur");
			System.out.println(check6);

			boolean checkout6 = collection6.contains("Bidar");
			System.out.println(checkout6);

			boolean contained6 = collection6.isEmpty();
			System.out.println(contained6);

			collection.clear();
			System.out.println("After clearing");
		}

		Collection<String> collection7 = new ArrayList<String>();
		collection7.add("Arisa Pitha");
		collection7.add("Apple Halwa");
		collection7.add("Balushahi");
		collection7.add("Boondi");
		collection7.add("Gajar ka halwa");
		collection7.add("Ghevar");
		collection7.add("Gulab jamun");
		collection7.add("Imarti");
		collection7.add("Jalebi");
		collection7.add("Kaju katli");
		collection7.add("Kalakand");
		collection7.add("Kheer");
		collection7.add("Khirmohan");
		collection7.add("Kulfi");
		collection7.add("Laddu");
		collection7.add("Lassi");
		collection7.add("Motichoor laddu");
		collection7.add("Malpua");
		collection7.add("Nankhatai");
		collection7.add("Petha");
		collection7.add("Phirni");
		collection7.add("Rabri");
		collection7.add("Sheera");
		collection7.add("Singori");
		collection7.add("Sohan halwa");
		collection7.add("Sohan papdi, pateesa");
		collection7.add("Amriti");
		collection7.add("Cham cham");
		collection7.add("Chandrapuli");
		collection7.add("Chhena gaja");
		collection7.add("Chhena jalebi");
		collection7.add("Chhena Jhili");
		collection7.add("Chhena kheeri");
		collection7.add("Chhena poda");
		collection7.add("Chuda Ghasa");
		collection7.add("Coconut Barfi");
		collection7.add("Kheer sagar");
		collection7.add("Ledikeni");
		collection7.add("Lyangcha");
		collection7.add("Malapua");
		collection7.add("Mihidana");
		collection7.add("Misti doi");
		collection7.add("Pantua");
		collection7.add("Pithe");
		collection7.add("Puri Khaja");
		collection7.add("Rabri	");
		collection7.add("Rasabali");
		collection7.add("Ras malai");
		collection7.add("Rasgulla");
		collection7.add("Sandesh");
		collection7.add("Sirir naru");
		collection7.add("Ada");
		collection7.add("Adhirasam");
		collection7.add("Bandar laddu");
		collection7.add("Chikki");
		collection7.add("Dharwad Pedha");
		collection7.add("Double ka Meetha");
		collection7.add("god pole");
		collection7.add("god bhat");
		collection7.add("fafad");
		System.out.println("sweets size:" + collection7.size());
		System.out.println(collection7);

		Iterator<String> it9 = collection.iterator();
		while (it9.hasNext()) {
			System.out.println(it9.next());

			boolean check7 = collection7.remove("Chikki");
			System.out.println(check7);

			boolean checkout7 = collection7.contains("Jalebi");
			System.out.println(checkout7);

			boolean contained7 = collection7.isEmpty();
			System.out.println(contained7);

			collection.clear();
			System.out.println("After clearing");
		}

		Collection<String> collection8 = new ArrayList<String>();
		collection8.add("Hero Hounda");
		collection8.add("Hero");
		collection8.add("Activa");
		collection8.add("Hero Splendor");
		collection8.add("Hero Splendor+");
		collection8.add("Bajaja");
		collection8.add("Pulser 150");
		collection8.add("Pulser 250");
		collection8.add("TVS ");
		collection8.add("TVS XL100");
		collection8.add("TVS Apache RTR 200 4V");
		collection8.add("TVS Apache RR 310");
		collection8.add("TVS Scooty Pep Plus");
		collection8.add("TVS Apache RTR 180");
		collection8.add("TVS Star City Plus");
		collection8.add("TVS Scooty Zest");
		collection8.add("TVS NTORQ 125");
		collection8.add("TVS Radeon");
		collection8.add("TVS iQube Electric");
		collection8.add("TVS Raider");
		collection8.add("Pulser 180");
		collection8.add("TVS Apache RTR 160");
		collection8.add("Jawa 42");
		collection8.add("Jawa Perak");
		collection8.add("Jawa");
		collection8.add("Jawa Cruiser");
		collection8.add("Bajaj Pulsar 150");
		collection8.add("Bajaj Pulsar NS200");
		collection8.add("Bajaj Pulsar 220 F");
		collection8.add("Bajaj Pulsar RS200");
		collection8.add("Bajaj Pulsar 125 Neon");
		collection8.add("Bajaj CT100");
		collection8.add("Bajaj Dominar 400");
		collection8.add("Bajaj Pulsar NS 125");
		collection8.add("Bajaj Pulsar NS160");
		collection8.add("Bajaj Platina 100");
		collection8.add("Bajaj Pulsar F250	");
		collection8.add("Bajaj Pulsar 180	");
		collection8.add("Bajaj Chetak");
		collection8.add("Bajaj CT110");
		collection8.add("Bajaj Dominar 250");
		collection8.add("Bajaj Avenger Cruise 220");
		collection8.add("Bajaj Pulsar N250");
		collection8.add("Bajaj Platina 110 H Gear");
		collection8.add("Bajaj Avenger Street 160");
		collection8.add("Bajaj Platina 110");
		collection8.add("Bajaj NS250");
		collection8.add("Bajaj Avenger 400");
		collection8.add("KTM RC 200");
		collection8.add("KTM 200 Duke");
		collection8.add("KTM 125 Duke");
		collection8.add("KTM RC 390");
		collection8.add("KTM 390 Duke");
		collection8.add("KTM 250 Duke");
		collection8.add("KTM RC 125 ");
		collection8.add("2021 KTM RC 125");
		collection8.add("2021 KTM RC 200");
		collection8.add("KTM 390 Adventure");
		collection8.add("pulsar 150");
		collection8.add("KTM 250 Adventure");
		System.out.println("bike size:" + collection8.size());
		System.out.println(collection8);

		Iterator<String> it32 = collection8.iterator();
		while (it32.hasNext()) {
			System.out.println(it32.next());

			boolean check9 = collection8.remove(collection8);
			System.out.println(check9);

			boolean checkout9 = collection8.contains(collection8);
			System.out.println(checkout9);

			boolean contained9 = collection8.isEmpty();
			System.out.println(contained9);

			collection.clear();
			System.out.println("After clearing");
		}

		Collection<String> collection9 = new ArrayList<String>();
		collection9.add("Micro");
		collection9.add("Nano ");
		collection9.add("Hatchback");
		collection9.add("Sedon");
		collection9.add("Mpv");
		collection9.add("Converible");
		collection9.add("Wogon");
		collection9.add("Luxury");
		collection9.add("Antique");
		collection9.add("Couple car");
		collection9.add("Spoart car");
		collection9.add("Supercar");
		collection9.add("Sport Hatchback");
		collection9.add("Ambition Convertible");
		collection9.add(" new Ambition Hatchback ");
		collection9.add("Audi Attraction Convertible ");
		collection9.add("Audi A3 E-Tron ");
		collection9.add("Electrc car");
		collection9.add("audi A1");
		collection9.add("Audi A2");
		collection9.add("Audi A3");
		collection9.add("Audi A4");
		collection9.add("Audi A5");
		collection9.add("Audi A6");
		collection9.add("Audi 255d");
		collection9.add("Audi 450d");
		collection9.add("Audi 220d");
		collection9.add("Audi 250d");
		collection9.add("Toro Rosso");
		collection9.add("Red bull RBS");
		collection9.add("Red Bull RB6");
		collection9.add("Red Bull RB6");
		collection9.add("Red Bull RB6");
		collection9.add("Red Bull RB6");
		collection9.add("Ferrari SF15-T");
		collection9.add("Ferrari SF15-T");
		collection9.add("Ferrari SF15-T");
		collection9.add("Jaguar F-Type ");
		collection9.add("Jaguar  Convertible ");
		collection9.add("Jaguar F-Type Convertible");
		collection9.add("Mercedes AMG GT AMG GT Roadster 2018");
		collection9.add("Ferrari SF15-T");
		collection9.add("Trzan");
		collection9.add("Mercedes-Benz blue");
		collection9.add("Mercedes-Benz Hatchback");
		collection9.add("Mercedes-Benz AMG GT ");
		collection9.add("Mercedes-Benz Golden");
		collection9.add("Mercedes-Benz Silver");
		collection9.add("Mercedes-Benz Black");
		collection9.add("Mercedes-Benz Red");
		collection9.add("Mercedes-Benz Electric");
		collection9.add("Mercedes-Benz  Hatchback ");
		collection9.add("Mercedes-Benz ");
		collection9.add("Volvo C30 ");
		collection9.add("Hero");
		collection9.add("Hounda");
		collection9.add("Tata Indica");
		collection9.add("Beanch");
		collection9.add("Kia Car");
		collection9.add("Tesla");
		collection9.add("Indica car");
		System.out.println("cars size:" + collection9.size());
		System.out.println(collection9);

		Iterator<String> it8 = collection9.iterator();
		while (it8.hasNext()) {
			System.out.println(it8.next());

		}
		boolean check11 = collection9.remove(collection9);
		System.out.println(check11);

		boolean checkout11 = collection9.contains(collection8);
		System.out.println(checkout11);

		boolean contained11 = collection9.isEmpty();
		System.out.println(contained11);

		collection.clear();
		System.out.println("After clearing");

		Collection<String> collection10 = new ArrayList<String>();
		collection10.add("Red");
		collection10.add("Lip Stains");
		collection10.add("Sheer Lipistic");
		collection10.add("Satin");
		collection10.add("Creamy");
		collection10.add("Frosted Lipistic");
		collection10.add("Lip Stains or Tints");
		collection10.add("Glossy");
		collection10.add("metallic");
		collection10.add("Tinted Lip Balm");
		collection10.add("Lip Liner");
		collection10.add("Cream Lipsticks");
		collection10.add("Gloss Lipsticks");
		collection10.add("Lipstick Stains");
		collection10.add("Long-Wearing");
		collection10.add("Matte Lipsticks");
		collection10.add("Moisturizing Lipsticks");
		collection10.add("Pearl/Frosted Lipsticks");
		collection10.add("Sheer/Satin Lipsticks");
		collection10.add("Black Honey");
		collection10.add(" Lip Pencil");
		collection10.add("NARS Semi Matte");
		collection10.add("Chanel Rouge Allure ");
		collection10.add("MAC Red Lipstick");
		collection10.add("Revlon Super Lustrous ");
		collection10.add("Tom Ford Lip Color");
		collection10.add("NARS Lipstick");
		collection10.add("GIORGIO ARMANI BEAUTY Rouge");
		collection10.add("Brown by Bobbi Brown");
		collection10.add("Longwear Fluid Lip Color");
		collection10.add("CHARLOTTE TILBURY");
		collection10.add("DIOR Rouge Dior Lipstick");
		collection10.add("M.A.C Lipstick Matte");
		collection10.add("SEPHORA COLLECTION Cream Lip ");
		collection10.add("Exaltée by Chanel");
		collection10.add("Rimmel London Lip Stick");
		collection10.add("DIOR Rouge Dior Lipstick");
		collection10.add("M.A.C Viva Glam Lipstick");
		collection10.add("Tom Ford Lip Color");
		collection10.add("Lancome ROUGE IN LOVE");
		collection10.add("Tom Ford Lip Color");
		collection10.add("L’Oréal Paris Colour Riche Lipstick");
		collection10.add("Rimmel London Lasting Finish");
		collection10.add("Kate Lipstick");
		collection10.add("Maybelline Color ");
		collection10.add("Covergirl Lip Perfection Lipstick");
		collection10.add("New Nudes Sheer Gel Lipstick");
		collection10.add("ESTÉE LAUDER Pure Color Envy Sculpting Lipstick");
		collection10.add("Shiseido Lipstick");
		collection10.add("LIPSTICK QUEEN Medieval Lipstick");
		collection10.add("CONVERTIBLE COLOR");
		collection10.add("SHINE FEVER ");
		collection10.add("Ruby Woo by M.A.C.");
		collection10.add("Black Honey Almost Lipstick");
		collection10.add("M.A.C Lip Penci");
		collection10.add("Lady Danger by M.A.C.");
		collection10.add("Pirate by Chanel");
		collection10.add("Schiap by NARS");
		collection10.add("Glam Lipistick");
		collection10.add("kate Lipstick");
		System.out.println("Lipstick size:" + collection10.size());
		System.out.println(collection10);

		Iterator<String> it44 = collection10.iterator();
		while (it44.hasNext()) {
			System.out.println(it44.next());

		}
		boolean check14 = collection10.remove(collection10);
		System.out.println(check14);

		boolean checkout14 = collection10.contains(collection8);
		System.out.println(checkout14);

		boolean contained14 = collection10.isEmpty();
		System.out.println(contained14);

		collection.clear();
		System.err.println("cleared");
	}

}
