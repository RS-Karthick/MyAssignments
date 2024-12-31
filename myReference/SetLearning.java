package myReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SetLearning {
public static void main(String[] args) {
	
	//Hashset type
	Set<String> set1 = new HashSet<String>();
	
	set1.add("Karthick");
	set1.add("Azar");
	set1.add("Dayana");
	set1.add("Regina");
	
	System.out.println("HashSet : "+set1);
	
	//TreeSet
Set<String> set2= new TreeSet<String>();
	
	set2.add("Karthick");
	set2.add("Azar");
	set2.add("Dayana");
	set2.add("Regina");
	
	System.out.println("TreeSet : "+set2);
	
	//LinkedHashSet
Set<String> set3 = new LinkedHashSet<String>();
	
	set3.add("Karthick");
	set3.add("Azar");
	set3.add("Dayana");
	set3.add("Regina");
	set3.add("Regina");
	set3.add("regina");
	System.out.println(set3.add("rEgina"));
	System.out.println(set3.add("Azar"));
	System.out.println(set3.add("karthick"));
	System.out.println("LinkedHashSet : " +set3);
	//System.out.println(set3.add("karthick"));
	
	List<String> list1 = new ArrayList<String>(set3); // here too get addall collections
	//list1.addAll(set3);
	System.out.println(list1.get(0));
	
	//clear
	//set1.clear();
	//System.out.println(set1);
	
	//remove
	//set2.remove("Kasali");
	//set2.remove("Azar");
	//System.out.println(set2);
	//System.out.println(set2.remove("Surya"));
	
	//addall
//removeall
	set2.removeAll(set2);
	System.out.println("set2 : "+set2);
	//set3.size();
	System.out.println(set3.size());
	
	System.out.println(set3.contains("rEgina"));
}
}
