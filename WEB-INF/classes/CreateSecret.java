/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

import classes.*;
import java.io.*;
import java.util.*;

public class CreateSecret 
{
	
	public static void main(String [] args) throws IOException
	{ 
		int [] id = {0,100,200,300,400,500,600,700,800,900,1000,2000,3000,4000,5000,6000,10000};
			
		Items [] listitems =
	  
	   {//"1989", Taylor Swift, pop, $12.49
		//"1989" is a pop and synthpop album which Swift described as her "first documented, official pop album,"
		//representing a musical departure from the country pop styles in her earlier work. The albums production 
		//differs from Swifts previous work unlike others "1989" is built over drum programming, synthesizers, 
		//pulsating bass, processed backing vocals and guitars. Its lyrical content is based mainly in Swift's
		//style of writing about Love, the albums content frequently discusses the complexities of relationships.

		new Song
			("101", "Welcome To New York", "Big Machine", "Taylor Swift", "1989", "pop", "3:32", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
		
		new Song
			("102", "Blank Space", "Big Machine", "Taylor Swift", "1989", "pop", "3:51", 1.29, 20, 5, "../src/images/BlankSpaceSong.jpg", "11/02/2014"),
		
		new Song
			("103", "Style", "Big Machine", "Taylor Swift", "1989", "pop", "3:51", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
			
		new Song
			("104", "Out of the Woods", "Big Machine", "Taylor Swift", "1989", "pop", "3:55", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
			
		new Song
			("105", "All You Had To Do Was Stay", "Big Machine", "1989", "Taylor Swift", "pop", "3:13", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
		
		new Song
			("106", "Shake It Off", "Big Machine", "Taylor Swift", "1989", "pop", "3:39", 1.29, 50, 5, "../src/images/ShakeItOffSong.png", "11/02/2014"),
		
		new Song
			("107", "I Wish You Would", "Big Machine", "Taylor Swift", "1989", "pop", "3:27", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
		
		new Song
			("108", "Bad Blood", "Big Machine", "Taylor Swift", "1989", "pop", "3:31", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
			
		new Song
			("109", "Wildest Dreams", "Big Machine", "Taylor Swift", "1989", "pop", "3:40", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
			
		new Song
			("110", "How You Get The Girl", "Big Machine", "Taylor Swift", "1989", "pop", "4:07", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
			
		new Song
			("111", "This Love", "Big Machine", "Taylor Swift", "1989", "pop", "4:10", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
			
		new Song
			("112", "I Know Places", "Big Machine", "Taylor Swift", "1989", "pop", "3:15", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
			
		new Song
			("113", "Clean", "Big Machine", "Taylor Swift", "1989", "pop", "4:31", 1.29, 0, 0, "../src/images/T.S.1989CoverAlbum.jpg", "11/02/2014"),
		
		new Album
			("1", "1989", "Big Machine", "Taylor Swift", "pop", 12.49, 32, 4, "../src/images/T.S.1989Album.jpg", "11/02/2014", "../src/images/T.S.1989CoverAlbum.jpg"),
		
		//"Pain Killer", Little Big Town, country, $11.49 
		//Pain Killer is the sixth studio album by American country music group Little Big Town. 
		//It was released on October 21, 2014, through Capitol Nashville. Little Big Town co-wrote
		//eight of the album's thirteen tracks. Pain Killer was produced by Jay Joyce.
		
		new Song
			("201", "Quit Breaking Up With Me", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "3:24", 1.29, 0, 0,"../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
		
		new Song
			("202", "Day Drinking", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "2:58", 1.29, 30, 4, "../src/images/DayDrinkinSong.jpg", "11/05/2014"),
		
		new Song
			("203", "Tumble And Fall", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "4:41", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
			
		new Song
			("204", "Pain Killer", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "3:11", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
			
		new Song
			("205", "Girl Crush", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "3:13", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
		
		new Song
			("206", "Faster Gun", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "4:10", 1.29, 0, 0, "../src/images/DefaultAlbum.jpg", "11/05/2014"),
		
		new Song
			("207", "Good People", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "3:41", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
		
		new Song
			("208", "Stay All Night", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "2:45", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
			
		new Song
			("209", "Save Your Sin", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", " 2:46", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
			
		new Song
			("210", "Live Forever", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "4:14", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
			
		new Song
			("211", "Things You Don't Think About", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "3:37", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
			
		new Song
			("212", "Turn The Lights On", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "4:08", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
			
		new Song
			("213", "Silver And Gold", "Capitol Nashville", "Little Big Town", "Pain Killer", "country", "3:31", 1.29, 0, 0, "../src/images/PainKillerCoverAlbum.jpg", "11/05/2014"),
		
		new Album
			("2", "Pain Killer", "Capitol Nashville", "Little Big Town", "country", 11.49, 23, 4, "../src/images/DefaultAlbum.jpg", "11/05/2014", "../src/images/PainKillerCoverAlbum.jpg"),
			
		//".5: The Gray Chapter", Slipknot, $12.49  
		//.5: The Gray Chapter is the fifth studio album by American heavy metal band Slipknot. 
		//It was released in Australia, Belgium and the Netherlands on October 17, 2014 and in North 
		//America on October 21, 2014. It is the first studio album by the band in six years and 
		//the first to not feature founding bassist Paul Gray and long time drummer Joey Jordison due
		//to the death of Gray in 2010 (the title of the album being a reference to his name), and 
		//the departure of Jordison in late 2013. A standard and deluxe edition of the album was 
		//released. The deluxe edition features two listed bonus tracks and 3 unlisted bonus tracks, 
		//as well as another special edition featuring a T-shirt of the album cover has been released.
		
		new Song
			("301", "XIX [Explicit]", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "3:10", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song	
			("302", "Sarcastrophe [Explicit]", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "5:06", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("303", "AOV [Explicit]", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "5:32", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("304", "The Devil In I", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "5:42", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("305", "Killpop [Explicit]", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "3:45", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song 
			("306", "Skeptic [Explicit]", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "4:46", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("307", "Lech [Explicit]", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "4:50", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("308", "Goodbye", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "4:35", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("309", "Nomadic [Explicit]", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "4:18", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("310", "The One That Kills The Least", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "4:11", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("311", "Custer [Explicit]", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "4:14", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("312", "Be Prepared For Hell", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "1:57", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("313", "The Negative One [Explicit]", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "5:25", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("314", "If Rain Is What You Want", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "6:20", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("315", "Override", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "5:37", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Song
			("316", "The Burden", "Roadrunner", "Slipknot", ".5: The Gray Chapter", "rock", "5:23", 1.29, 0, 0, "../src/images/TheGrayChapterCoverAlbum.jpg", "11/07/2014"),
		new Album
			("3", ".5: The Gray Chapter", "Roadrunner", "Slipknot", "rock", 12.49, 33, 5, "../src/images/DefaultAlbum.jpg", "11/07/2014", "../src/images/TheGrayChapterCoverAlbum.jpg"),
			
		//"The New Classic", Iggy Azalea, hip hop, $11.99	
		/**	
		The New Classic is the debut studio album by the Australian recording artist Iggy Azalea. 
		The album was released on 21 April 2014, under Island in US, Virgin EMI in UK, and affiliated record labels in other countries. 
		Azalea came to prominence after releasing her debut mixtape Ignorant Art and subsequently 
		aligning herself with American rapper T.I. and his Hustle Gang imprint. 
		*/
		
		new Song
			("401", "Walk the Line", "Virgin EMI", "Iggy Azalea", "The New Classic", "hip hop", "3:38", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Song
			("402", "Don't Need Y'all", "Virgin EMI", "Iggy Azalea", "The New Classic", "hip hop", "3:33", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Song
			("403", "100", "Virgin EMI", "Iggy Azalea feat. Watch the Duck", "The New Classic", "hip hop", "4:09", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Song
			("404", "Change Your Life", "Virgin EMI", "Iggy Azalea feat. T.I.", "The New Classic", "hip hop", "3:40", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Song
			("405", "Fancy", "Virgin EMI", "Iggy Azalea feat. Charli XCX", "The New Classic", "hip hop", "3:37", 1.29, 60, 5, "../src/images/FancySong.jpg", "11/18/2014"),
		new Song
			("406", "New Bitch", "Virgin EMI", "Iggy Azalea", "The New Classic", "hip hop", "3:37", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Song
			("407", "Work", "Virgin EMI", "Iggy Azalea", "The New Classic", "hip hop", "3:43", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Song
			("408", "Impossible is Nothing", "Virgin EMI", "Iggy Azalea", "The New Classic", "hip hop", "3:10", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Song
			("409", "Goddess", "Virgin EMI", "Iggy Azalea", "The New Classic", "hip hop", "3:10", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Song
			("410", "Black Widow", "Virgin EMI", "Iggy Azalea feat. Rita Ora", "The New Classic", "hip hop", "3:29", 1.29, 34, 4, "../src/images/BlackWidowSong.png", "11/18/2014"),
		new Song
			("411", "Lady Patra", "Virgin EMI", "Iggy Azalea feat. Mavado", "The New Classic", "hip hop", "3:56", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Song
			("412", "Fuck Love", "Virgin EMI", "Iggy Azalea", "The New Classic", "hip hop", "2:39", 1.29, 0, 0, "../src/images/TheNewClassicCoverAlbum.jpg", "11/18/2014"),
		new Album
			("4", "The New Classic", "Virgin EMI", "Iggy Azaleat", "hip hop", 11.49, 53, 4, "../src/images/TheNewClassicAlbum.jpg", "11/18/2014", "../src/images/TheNewClassicCoverAlbum.jpg"),

		//"My Everything", Ariana Grande, electronic, $9.99	
		/**	
		My Everything is the second studio album by American singer Ariana Grande. 
		Work on the album began in October 2013 one month after the release of 
		Grande's debut album Yours Truly and finished in late May 2014.
		The album is what Grande calls "an evolution" from her first album with more mature 
		themes and the exploration of new genres. 
		My Everything was released on August 22, 2014, by Republic Records and debuted 
		atop the Billboard 200 selling 169,000 copies in its first week.
		*/
		
		new Song
			("501", "Intro", "Republic", "Ariana Grande", "My Everything", "electronic", "1:20", 1.29, 0, 0, "../src/images/MyEverythingCoverAlbum.jpg", "11/18/2014"),
		new Song
			("502", "Problem", "Republic", "Ariana Grande feat. Iggy Azalea", "My Everything", "electronic", "3:13", 1.29, 45, 4, "../src/images/ProblemSong.jpg", "11/18/2014"),
		new Song
			("503", "One Last Time", "Republic", "Ariana Grande", "My Everything", "electronic", "3:17", 1.29, 0, 0, "../src/images/MyEverythingCoverAlbum.jpg", "11/18/2014"),
		new Song
			("504", "Why Try", "Republic", "Ariana Grande", "My Everything", "electronic", "3:31", 1.29, 0, 0, "../src/images/MyEverythingCoverAlbum.jpg", "11/18/2014"),
		new Song
			("505", "Break Free", "Republic", "Ariana Grande feat. Zedd", "electronic", "My Everything", "3:35", 1.29, 42, 5, "../src/images/BreakFreeSong.jpg", "11/18/2014"),
		new Song
			("506", "Best Mistake", "Republic", "Ariana Grande feat. Big Sean", "My Everything", "electronic", "3:53", 1.29, 0, 0, "../src/images/MyEverythingCoverAlbum.jpg", "11/18/2014"),
		new Song
			("507", "Be My Baby", "Republic", "Ariana Grande feat. Cashmere Cat", "My Everything", "electronic", "3:36", 1.29, 0, 0, "../src/images/MyEverythingCoverAlbum.jpg", "11/18/2014"),
		new Song
			("508", "Break Your Heart Right Back", "Republic", "Ariana Grande feat. Childish Gambino", "My Everything", "electronic", "4:13", 1.29, 0, 0, "../src/images/MyEverythingCoverAlbum.jpg", "11/18/2014"),
		new Song
			("509", "Love Me Harder", "Republic", "Ariana Grande feat. The Weeknd", "My Everything", "electronic", "3:56", 1.29, 10, 3, "../src/images/LoveMeHarderSong.jpg", "11/18/2014"),
		new Song
			("510", "Just a Little Bit of Your Heart", "Republic", "Ariana Grande", "My Everything", "electronic", "3:51", 1.29, 0, 0, "../src/images/MyEverythingCoverAlbum.jpg", "11/18/2014"),
		new Song
			("511", "Hands on Me", "Republic", "Ariana Grande feat. A$AP Ferg", "My Everything", "electronic", "3:13", 1.29, 0, 0, "../src/images/MyEverythingCoverAlbum.jpg", "11/18/2014"),
		new Song
			("512", "My Everything", "Republic", "Ariana Grande", "My Everything", "electronic", "2:48", 1.29, 0, 0, "../src/images/MyEverythingCoverAlbum.jpg", "11/18/2014"),
		new Album
			("5", "My Everything", "Republic", "Ariana Grande", "electronic", 9.99, 63, 5, "../src/images/MyEverythingAlbum.jpg", "11/18/2014", "../src/images/MyEverythingCoverAlbum.jpg"),
			
		//"Sex and Love", Enrique Iglesias, others, $11.99	
		/**	
		Sex and Love is the tenth studio album by Spanish recording artist Enrique Iglesias. 
		It was released on 14 March 2014 by Republic Records. 
		The album's three Spanish singles: "Loco", "El Perdedor" and "Bailando" reached No. 1 on the Billboard Hot Latin Songs chart.
		*/
		
		new Song
			("601", "I'm a Freak", "Republic", "Enrique Iglesias feat. Pitbull", "Sex and Love", "others", "3:39", 1.29, 0, 0, "../src/images/SexAndLoveCoverAlbum.jpg", "11/18/2014"),
		new Song
			("602", "There Goes My Baby", "Republic", "Enrique Iglesias feat. Flo Rida", "Sex and Love", "others", "3:18", 1.29, 0, 0, "../src/images/SexAndLoveCoverAlbum.jpg", "11/18/2014"),
		new Song
			("603", "Bailando", "Republic", "Enrique Iglesias feat. Sean Paul, Descemer Bueno and Gente de Zona", "Sex and Love", "others", "4:03", 1.29, 56, 5, "../src/images/BailandoSong.jpg", "11/18/2014"),
		new Song
			("604", "El Perdedor", "Republic", "Enrique Iglesias feat. Marco Antonio Solis", "Sex and Love", "others", "3:11", 1.29, 20, 3, "../src/images/ElPerdedorSong.jpg", "11/18/2014"),
		new Song
			("605", "Loco", "Republic", "Enrique Iglesias feat. Romeo Santos", "Sex and Love", "others", "3:33", 1.29, 0, 0, "../src/images/SexAndLoveCoverAlbum.jpg", "11/18/2014"),
		new Song
			("606", "Let Me Be Your Lover", "Republic", "Enrique Iglesias feat. Pitbull", "Sex and Love", "others", "3:58", 1.29, 0, 0, "../src/images/SexAndLoveCoverAlbum.jpg", "11/18/2014"),
		new Song
			("607", "You and I", "Republic", "Enrique Iglesias", "Sex and Love", "others", "3:05", 1.29, 0, 0, "../src/images/SexAndLoveCoverAlbum.jpg", "11/18/2014"),
		new Song
			("608", "Heart Attack", "Republic", "Enrique Iglesias", "Sex and Love", "others", "2:50", 1.29, 12, 3, "../src/images/HeartAttackSong.jpg", "11/18/2014"),
		new Song
			("609", "Me Cuesta Tanto Olvidarte", "Republic", "Enrique Iglesias", "Sex and Love", "others", "3:34", 1.29, 0, 0, "../src/images/SexAndLoveCoverAlbum.jpg", "11/18/2014"),
		new Song
			("610", "Noche y De Día", "Republic", "Enrique Iglesias feat. Yandel and Juan Magan", "Sex and Love", "others", "3:42", 1.29, 0, 0, "../src/images/SexAndLoveCoverAlbum.jpg", "11/18/2014"),
		new Song
			("611", "Loco", "Republic", "Enrique Iglesias feat. India Martinez",  "Sex and Love","others", "3:13", 1.29, 0, 0, "../src/images/SexAndLoveCoverAlbum.jpg", "11/18/2014"),
		new Album
			("6", "Sex and Love", "Republic", "Enrique Iglesias", "others", 11.99, 43, 4, "../src/images/SexAndLoveAlbum.jpg", "11/18/2014", "../src/images/SexAndLoveCoverAlbum.jpg"),
			
		//"Greatest Hits: Decade 1", Carrie Underwood, country, $13.99	
		/**	
		Greatest Hits: Decade #1 is the first greatest hits album by American country music artist, Carrie Underwood, 
		set to be released on December 9, 2014, by 19 and Sony Music Nashville.[1] It contains material 
		from Underwood's four studio albums: Some Hearts (2005), Carnival Ride (2007), Play On (2009) and Blown Away (2012). Upon its new material,
		"Something in the Water" was released as the album's first single on September 29, 2014.
		Exclusive pre-release on 12/05/2014 only here on RedHawkMusic.com
		*/
		
		new Song
			("701", "Something in the Water", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:56", 1.29, 0, 0,"../src/images/SomethingInTheWaterSong.jpg", "12/09/2014"),
		new Song
			("702", "Little Toy Guns", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:56", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("703", "Inside Your Heaven", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:45", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("704", "Jesus, Take the Wheel", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:46", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("705", "Don't Forget to Remember Me", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:00", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("706", "Before He Cheats", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:18", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("707", "Wasted", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:34", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("708", "So Small", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:47", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("709", "All-American Girl", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:32", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("710", "Last Name", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:00", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("711", "Just a Dream", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:44", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("712", "I Told You So", "19 & Sony Music Nashville", "Carrie Underwood & Randy Travis", "Greatest Hits: Decade 1", "country", "4:17", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("713", "Cowboy Casanova", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:53", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("714", "Temporary Home", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:28", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("715", "Undo it", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "2:57", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("716", "Mama's Song", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:09", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("717", "Remind Me", "19 & Sony Music Nashville", "Carrie Underwood & Brad Paisley", "Greatest Hits: Decade 1", "country", "4:32", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("718", "Good Girl", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:25", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("719", "Blown Away", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:00", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("720", "Two Black Cadillacs", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:59", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("721", "See You Again", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:07", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("722", "How Great Thou Art", "19 & Sony Music Nashville", "Carrie Underwood & Vince Gill", "Greatest Hits: Decade 1", "country", "3:32", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("723", "So Small (Songwritting Sessions)", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "3:47", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("724", "Last Name (Songwritting Sessions)", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:00", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Song
			("725", "Mama's Song (Songwritting Sessions)", "19 & Sony Music Nashville", "Carrie Underwood", "Greatest Hits: Decade 1", "country", "4:00", 1.29, 0, 0,"../src/images/GreatestHitsDecade1CoverAlbum.png", "12/09/2014"),
		new Album
			("7", "Greatest Hits: Decade 1", "19 & Sony Music Nashville", "Carrie Underwood", "country", 13.99, 1, 5, "../src/images/DefaultAlbum.jpg", "12/05/2014", "../src/images/GreatestHitsDecade1CoverAlbum.png"),
		
		//"Motion", Calvin Harris, electronic, $11.99	
		/**	
		Motion is the fourth studio album by Scottish disc jockey and record producer Calvin Harris. 
		It was released on 31 October 2014 by Fly Eye Records and Columbia Records.
		*/
		
		new Song
			("801", "Faith", "Columbia", "Calvin Harris", "Motion", "electronic", "3:39", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("802", "Under Control", "Columbia", "Calvin Harris & Hurts", "Motion", "electronic", "3:04", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("803", "Blame", "Columbia", "Calvin Harris & John Newman", "Motion", "electronic", "3:32", 1.29, 60, 5,"../src/images/BlameSong.jpg", "11/24/2014"),
		new Song
			("804", "Love Now", "Columbia", "Calvin Harris & All About She", "Motion", "electronic", "3:32", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("805", "Slow Acid", "Columbia", "Calvin Harris", "Motion", "electronic", "3:41", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("806", "Outside", "Columbia", "Calvin Harris & Ellie Goulding", "Motion", "electronic", "3:47", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("807", "It Was You", "Columbia", "Calvin Harris & Firebeatz", "Motion", "electronic", "3:44", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("808", "Summer", "Columbia", "Calvin Harris", "Motion", "electronic", "3:42", 1.29, 56, 5,"../src/images/SummerSong.jpg", "11/24/2014"),
		new Song
			("809", "Overdrive", "Columbia", "Calvin Harris & Ummet Ozcan", "Motion", "electronic", "4:51", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("810", "Ecstasy", "Columbia", "Calvin Harris & Hurts", "Motion", "electronic", "3:41", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("811", "Pray to God", "Columbia", "Calvin Harris & Haim", "Motion", "electronic", "3:52", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("812", "Open Wide", "Columbia", "Calvin Harris & Big Sean", "Motion", "electronic", "3:07", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("813", "Together", "Columbia", "Calvin Harris & Gwen Stefani", "Motion", "electronic", "3:38", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("814", "Burnin", "Columbia", "Calvin Harris & R3hab", "Motion", "electronic", "3:54", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Song
			("815", "Dollar Signs", "Columbia", "Calvin Harris & Tinashe", "Motion", "electronic", "3:56", 1.29, 0, 0,"../src/images/MotionCoverAlbum.jpg", "11/24/2014"),
		new Album
			("8", "Motion", "Columbia", "Calvin Harris", "electronic", 11.99, 34, 4, "../src/images/DefaultAlbum.jpg", "11/24/2014", "../src/images/MotionCoverAlbum.jpg"),
			
		//"Shady XV", Hip Hop compilation Album , hip hop, $14.99	
		/**	
		Shady XV is a hip hop compilation album performed by various artists of Shady Records. 
		The double disc album was released on November 24, 2014, by Shady Records and Interscope Records.
		The album was released in honor of the label's 15th anniversary and as its 15th project (excluding Eminem's solo releases).
		*/
		
		new Song
			("901", "ShadyXV", "Shady, Interscope", "Eminem", "Shady XV", "hip hop", "5:01", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("902", "Psychopath Killer", "Shady, Interscope", "SlaughterHouse & Enminem", "Shady XV", "hip hop", "5:19", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("903", "Die Alone", "Shady, Interscope", "Eminem & Kobe", "Shady XV", "hip hop", "3:36", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("904", "Vegas", "Shady, Interscope", "Bad Meets Evil", "Shady XV", "hip hop", "3:36", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("905", "Y'all Ready Know", "Shady, Interscope", "SlaughterHouse", "Shady XV", "hip hop", "3:51", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("906", "Guts Over Fear", "Shady, Interscope", "Eminem & Sia", "Shady XV", "hip hop", "5:01", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("907", "Down", "Shady, Interscope", "Yelawolf", "Shady XV", "hip hop", "3:26", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("908", "Bane", "Shady, Interscope", "D12", "Shady XV", "hip hop", "4:24", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("909", "Fine Line", "Shady, Interscope", "Eminem", "Shady XV", "hip hop", "5:07", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("910", "Twisted", "Shady, Interscope", "Skylar Grey & Eminem & Yelawolf", "Shady XV", "hip hop", "4:59", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("911", "Right for Me", "Shady, Interscope", "Eminem", "Shady XV", "hip hop", "4:57", 1.29, 0, 0,"../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Song
			("912", "Detroit Vs. Everybody", "Shady, Interscope", "Eminem & Royce da 5'9'' & Big Sean & Danny Brown & DelJ Loaf & Trick-Trick", "Shady XV", "hip hop", "3:56", 1.29, 0, 0, "../src/images/ShadyXVCoverAlbum.jpg", "11/24/2014"),
		new Album
			("9", "Shady XV", "Shady, Interscope", "Hip Hop compilation Albums", "hip hop", 14.99, 44, 4, "../src/images/DefaultAlbum.jpg", "11/24/2014", "../src/images/ShadyXVCoverAlbum.jpg"),

		//"Title", Meghan Trainor, pop, $12.99	
		/**	
		Title is the third studio album and debut major label studio album by American singer Meghan Trainor. 
		The album will be released on January 13, 2015 by Epic Records. 
		The album comes after the success of her debut single "All About That Bass" which had peaked atop of the Billboard Hot 100.
		*/
		
		new Song
			("1001", "The Best Part (Interlude)", "Epic", "Meghan Trainor", "Title", "pop", "0:00", 1.29, 0, 0,"../src/images/TitleCoverAlbum.png", "01/13/2015"),
		new Song
			("1002", "All About That Base", "Epic", "Meghan Trainor", "Title", "pop", "3:07", 1.29, 67, 5,"../src/images/AllAboutThatBassSong.png", "01/13/2015"),
		new Song
			("1003", "Dear Future Husband", "Epic", "Meghan Trainor", "Title", "pop", "3:04", 1.29, 0, 0,"../src/images/TitleCoverAlbum.png", "01/13/2015"),
		new Song
			("1004", "Close Your Eyes", "Epic", "Meghan Trainor", "Title", "pop", "3:40", 1.29, 0, 0,"../src/images/TitleCoverAlbum.png", "01/13/2015"),
		new Song
			("1005", "3am", "Epic", "Meghan Trainor", "Title", "pop", "0:00", 1.29, 0, 0,"../src/images/TitleCoverAlbum.png", "01/13/2015"),
		new Song
			("1006", "Like I'm Gonna Lose You", "Epic", "Meghan Trainor", "Title", "pop", "0:00", 1.29, 0, 0,"../src/images/TitleCoverAlbum.png", "01/13/2015"),
		new Song
			("1007", "Bang Dem Sticks", "Epic", "Meghan Trainor", "Title", "pop", "0:00", 1.29, 0, 0,"../src/images/TitleCoverAlbum.png", "01/13/2015"),
		new Song
			("1008", "Walkashame", "Epic", "Meghan Trainor", "Title", "pop", "0:00", 1.29, 0, 0,"../src/images/TitleCoverAlbum.png", "01/13/2015"),
		new Song
			("1009", "Title", "Epic", "Meghan Trainor", "Title", "pop", "2:54", 1.29, 0, 0,"../src/images/TitleCoverAlbum.png", "01/13/2015"),
		new Song
			("1010", "What If I", "Epic", "Meghan Trainor", "Title", "pop", "0:00", 1.29, 0, 0,"../src/images/TitleCoverAlbum.png", "01/13/2015"),
		new Song
			("1011", "Lips Are Movin", "Epic", "Meghan Trainor", "Title", "pop", "3:01", 1.29, 1, 1,"../src/images/LipsAreMovinSong.jpg", "01/30/2015"),
		new Album
			("10", "Title", "Epic", "Meghan Trainor", "pop", 12.99, 0, 0, "../src/images/DefaultAlbum.jpg", "01/13/2015", "../src/images/TitleCoverAlbum.png"),
			
		//"V", Maroon 5, rock, $12.99	
		/**	
		V (pronounced "Five") is the fifth studio album by American pop rock band Maroon 5. 
		It was released on August 29, 2014, by Interscope Records as the follow-up to their fourth studio album Overexposed (2012).
		*/
		new Song
			("2001", "Maps", "Interscope", "Maroon 5", "V", "rock", "3:10", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Song
			("2002", "Animals", "Interscope", "Maroon 5", "V", "rock", "3:51", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),	
		new Song
			("2003", "It Was Always You", "Interscope", "Maroon 5", "V", "rock", "4:00", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Song
			("2004", "Unkiss Me", "Interscope", "Maroon 5", "V", "rock", "3:58", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Song
			("2005", "Sugar", "Interscope", "Maroon 5", "V", "rock", "3:55", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Song
			("2006", "Leaving California", "Interscope", "Maroon 5", "V", "rock", "3:23", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Song
			("2007", "In Your Pocket", "Interscope", "Maroon 5", "V", "rock", "3:39", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Song
			("2008", "New Love", "Interscope", "Maroon 5", "V", "rock", "3:16", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Song
			("2009", "Coming Back for You", "Interscope", "Maroon 5", "V", "rock", "3:47", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Song
			("2010", "Feelings", "Interscope", "Maroon 5", "V", "rock", "3:14", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Song
			("2011", "My Heart Is Open", "Interscope", "Maroon 5 & Gwen Stefani", "V", "rock", "3:57", 1.29, 0, 0,"../src/images/VCoverAlbum.jpg", "11/24/2014"),
		new Album
			("11", "V", "Interscope", "Maroon 5", "rock", 12.99, 34, 5, "../src/images/VAlbum.png", "11/24/2014", "../src/images/VCoverAlbum.jpg"),
		
		
		//------------------Song (no albums) Section------------------//
		
		new Song
			("9001", "Burnin' It Down", "Broken Bow Records", "Jason Aldean", "(no album)", "country", "3:44", 1.29, 34, 4,"../src/images/BurninItDownSong.jpg", "11/24/2014"),
		new Song
			("9002", "Leave the Night On", "MCA Nashville", "Sam Hunt", "(no album)", "country", "3:15", 1.29, 30, 4,"../src/images/LeaveTheNightOnSong.jpg", "11/24/2014"),
		new Song
			("9003", "Somewhere In My Car", "Capitol Nashville", "Keith Urban", "(no album)", "country", "4:29", 1.29, 20, 3,"../src/images/SomewhereinMyCarSong.jpg", "11/24/2014"),
		new Song
			("9004", "Waves", "Left Lane", "Mr Probz", "(no album)", "electronic", "2:54", 1.29, 45, 5,"../src/images/WavesSong.jpg", "11/24/2014"),
		new Song
			("9005", "Rather Be", "Warner", "Clean Bandit", "(no album)", "electronic", "3:49", 1.29, 45, 3,"../src/images/RatherBeSong.jpg", "11/24/2014"),
		new Song
			("9006", "Turn Down for What", "Columbia", "DJ Snake & Lil Jon", "(no album)", "electronic", "3:33", 1.29, 25, 4,"../src/images/TurnDownforWhatSong.jpg", "11/24/2014"),
		new Song
			("9007", "Don't Tell 'Em", "Def Jam", "Jeremih", "(no album)", "hip hop", "4:29", 1.29, 23, 3,"../src/images/DontTellThemSong.jpg", "11/24/2014"),
		new Song
			("9008", "Tuesday", "Sony", "ILOVEMAKONNEN & Drake", "(no album)", "hip hop", "4:36", 1.29, 45, 5,"../src/images/TuesdaySong.jpg", "11/24/2014"),
		new Song
			("9009", "Hot Boy", "Epic Records", "Bobby Shmurda", "(no album)", "hip hop", "3:08", 1.29, 23, 3,"../src/images/HotBoySong.jpg", "11/24/2014"),
		new Song
			("9010", "Habits", "Universal", "Tove Lo", "(no album)", "pop", "3:28", 1.29, 34, 4,"../src/images/HabitsSong.png", "11/24/2014"),
		new Song
			("9011", "Bang Bang", "Lava & Republic", "Jessie J & Ariana Grande & Nicki Minaj", "(no album)", "pop", "3:48", 1.29, 45, 5,"../src/images/BangBangSong.png", "11/24/2014"),
		new Song
			("9012", "Don't", "Atlantic", "Ed Sheeran", "(no album)", "pop", "3:39", 1.29, 34, 4,"../src/images/DontSong.png", "11/24/2014"),
		new Song
			("9013", "A Sky Full of Stars", "Parlophone", "Coldplay", "(no album)", "rock", "4:28", 1.29, 12, 3,"../src/images/ASkyFullOfStarsSong.jpg", "11/24/2014"),
		new Song
			("9014", "Centuries", "DCD2", "Fall Out Boy", "(no album)", "rock", "3:51", 1.29, 23, 4,"../src/images/CenturiesSong.jpg", "11/24/2014"),
		new Song
			("9015", "Take Me to Church", "Island", "Hozier", "(no album)", "rock", "4:05", 1.29, 23, 4,"../src/images/hozier.jpg", "11/24/2014"),
		new Song
			("9016", "Ain't Messin 'Round", "Warner Bros", " Gary Clark Jr.", "(no album)", "others", "4:09", 1.29, 45, 3,"../src/images/AintMessinRoundSong.jpg", "11/24/2014"),
		new Song
			("9017", "Secrets", "Capitol", "Mary Lambert", "(no album)", "others", "3:53", 1.29, 3, 3,"../src/images/SecretsSong.jpg", "11/24/2014"),
		new Song
			("9018", "Heroes", "Def Jam", " Alesso", "(no album)", "others", " 3:29", 1.29, 5, 4,"../src/images/HeroesSong.jpg", "11/24/2014"),
			
		//------------------Video Section------------------//

		new Video
			("10001", "The Heart Wants What It Wants", "Hollywood", "Selena Gomez", "pop", 1.99, 4, 4, "../src/images/TheHeartWWIWVideo.png", "11/18/2014", 2),
		new Video
			("10002", "Chandelier", "Monkey Puzzle", "Sia", "electronic", 1.99, 20, 5, "../src/images/ChandelierVideo.jpg", "11/18/2014", 30),
		new Video
			("10003", "Bailando", "Republic", "Enrique Iglesias", "others", 1.99, 40, 5, "../src/images/BailandoVideo.jpg", "11/18/2014", 60),
		new Video
			("10004", "Voodoo doll", "Capitol Records", "5 Seconds Of Summer", "rock", 1.99, 30, 5, "../src/images/VoodooDollVideo.jpg", "11/18/2014", 50),
		new Video
			("10005", "Leave the Night On", "MCA Nashville", "Sam Hunt", "country", 1.99, 35, 5, "../src/images/LeaveTheNightOnVideo.jpg", "11/18/2014", 55),
		new Video
			("10006", "Lips are Movin", "Epic", "Meghan Trainor", "pop", 1.99, 10, 5, "../src/images/LipsAreMovinVideo.jpg", "11/30/2014", 10)
			};

	Catalog newCatalog = new Catalog(listitems, id);
    String path = "C://apache-tomcat-7.0.34/webapps/project/catalog/catalog.ser";
	SerializeCatalog.serialize(newCatalog, path);
	}
}