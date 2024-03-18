package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieDetails {

	
	public List<String> showSeriesCharacter(String series) {
		List<String> movieList = new ArrayList<String>();
		if(series.equals("got")) {
			return (List<String>) Arrays.asList("Daenerys Targaryen","Jhon Snow","Tyrion Lannister","Arya Stark");
		}else if(series.equals("BB")) {
			return (List<String>) Arrays.asList("Walter White","Jesse Pinkman","Skyler White","Hank Schrader");
		}else if(series.equals("PB")) {
			return (List<String>) Arrays.asList("Michael Scofield","Lincoln Borrows Snow","Sara Tancredi","Fernando Sucre");
		}else if(series.equals("Nar")) {
			return (List<String>) Arrays.asList("Pablo Escobar","Steve Murphy","Gustavo Gaviria","Valeria Velez");
		}else if(series.equals("sc")) {
			return (List<String>) Arrays.asList("Sartaj Singh","Ganesh Gaitonde","Katekar","Kuko");
		}else if(series.equals("sg")) {
			return (List<String>) Arrays.asList("Seong Gi-hun ","Cho Sang-woo","Kang Sae-byeok","Hwang Jub-ho");
		}else if(series.equals("mh")) {
			return (List<String>) Arrays.asList("The Proffessor","Tokyo","Berlin","Denver");
		}else if(series.equals("mi")) {
			return (List<String>) Arrays.asList("Akhandanand Tripathi","Guddu Pandit","Bablu Pandit","Munna Tripathi","Maqbool Khan");
		}
		return movieList;
	}
}
