import java.util.*;
public class molfinal{	

	private String totalmolecule;
	private int numberofatoms = 0;
	private double[][] coor;
	private String[] names of atoms;
	private double mass;
	
	//names of each atom
	public String[] atomicnames = new String[] {
		"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si",
		"P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni",
		"Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb",
		"Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", 
		"Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho",
		"Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", 
		"Tl", "Pb", "Bi", "Po", "At","Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np",
		"Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg",
		"Bh", "Hs", "Mt", "Ds", "Rg", "Cn"
	}
		
	//each corresponding atomic mass
	public double[] atommass = new double[]{
		1.0079, 4.0026, 6.941, 9.0122, 10.811, 12.0011, 14.007, 15.999, 18.998, 20.180, 22.990, 24.305, 26.982, 28.086,
		30.974, 32.065, 35.453, 39.948, 39.098, 40.078, 44.956, 47.867, 50.942, 51.996, 54.938, 55.845, 58.933, 58.693,
		63.546, 65.39, 69.723, 72.61, 74.922, 78.96, 79.904, 83.80, 85.468, 87.62, 88.906, 91.224, 92.906, 95.94, 98, 
		101.07, 102.91, 106.42, 107.87, 112.41, 114.82, 118.71, 121.76, 127.60, 126.90, 131.29, 132.91, 137.33, 138.91,
		140.12, 140.91, 144.24, 145, 150.36, 151.96, 157.25, 158.93, 162.50, 164.93, 167.26, 168.93, 173.04, 174.97, 
		178.49, 180.95, 183.84, 186.21, 190.23, 192.22, 196.08, 196.97, 200.59, 204.38, 207.2, 208.98, 209.0, 210.0,
		222.0, 223.0, 226.0, 227.0, 232.04, 231.04, 238.03, 237.0, 244.0, 243.0, 247.0, 247.0, 251.0, 252.0, 257.0,
		258.0, 259.0, 260.0, 267, 268, 271, 272, 270, 281, 280, 285
	}
	
	//creates empty molecule with no argument
	public molecule (){
		totalmolecule = null;
		numberofatoms = 0;
		namesofatoms = null;
		coor = null;
	}
	
	//sets name of molecule, number of atoms, names
	public molecule(String name, int atomnum){
		totalmolecule = name;
		numberofatoms = atomnum;
		String[] namesofatoms = new String[atomnum];
		double[][] coor = new double[atomnum][3];
	}
	
	//uses inputted information to create new molecule
	public molecule(molecule x) {
		totalmolecule = x.gettotalmolecule();
		numofatoms = x.getnumberofatoms();
		names = x.getnamesofatoms();
		coor = x.getcoor();
		allmass = x.gettotalmass();
		allproton = x.gettotalproton();
		allneutron = x.gettotalneutron();
		allelectron = x.gettotalelectron();
	}
	
	public String toString(){
		return( "[Name: " +totalmolecule+ ", Number of atoms: " +numofatoms+ ", Names of atoms: " +Arrays.toString(namesofatoms)+ ", Mass of molecule: " +allmass"]");
	}
	
	//gets total proton or electron count of the molecule
	public int gettotalproton(){
		int protons = 0;
		for(int i = 0; i<numofatoms; i++){
			if(namesofatoms[i].equals(atomicnames[i]){
				protons+=i+1;
			}
		}
		return (protons);
	}
	
	//gets total neutron count of the molecule
	public int gettotalneutron(){
		int neutrons = 0;
		for(int i=0; i<numofatoms; i++){
			if(namesofatoms[i].equals(atomicnames[i])){
				neutrons+= (int)atommass[i]-i;
			}
		}
		return (neutrons);
	
	//gets total number of atoms in the molecule
	public int getnumberofatoms(){
		return (numberofatoms);
	}
	
	//gets the name of the molecule
	public string gettotalmolecule(){
		return (totalmolecule);
	}
	
	//gets the individual names of the atoms
	public String[] getnamesofatoms(){
		return(namesofatoms);
	}
	
	//gets the coordinates of the atoms
	public double[][] getcoor(){
		return(coor);
	} 
	
	//gets total mass of the molecule
	public double gettotalmass(){
		int totalmass = 0;
		for(int i=0; i<atomicnames.length(); i++){ 
			if(namesofatoms[i].equals(atomicnames[i])){
					totalmass+= atommass[i];
			}
		}
		return (totalmass);
	}

	//sets the names of each atom
	public void setnames()
	{
		Scanner x = new Scanner(System.in);
		for(int i=0; i<numberofatoms; i++)
		{
			System.out.println("Input the name of the atom:");
			namesofatoms[i]= x.nextLine();
			this.setcoor(i);
			this.setatommass(namesofatoms[i]);
		}	
	}
	
	//sets the coordinates of any atom
	public void setcoor (int numofatom){
		Scanner x = new Scanner(System.in);
		System.out.println("Input your three coordinates.");
		coor[numofatom][0]= x.nextDouble();
		coor[numofatom][1]= x.nextDouble();
		coor[numofatom][2]= x.nextDouble();
	}
	
	//sets the individual mass of atoms in the molecule
	public void setatommass (String atomname){
		double atommass = 0;
		for(int i=0; i<atomicnames.length(); i++){ 
			if(atomname.equals(atomicnames[i])){
				atommass= atommass[i];
			}
		}
	}	
	
	//equals method to compare the molecule to other objects
	public boolean equals(Object a){
		if (a == null || a == 0){
			return (false);
		}
		
		//can't compare two objects of different class
		if (getClass() != a.getClass()){
			return (false);
		}
		
		molecule temp = (molecule) a;
		
		if (allmass == temp.gettotalmass()){
			return (true);
		}
		
		if(allproton == temp.gettotalproton()){
			return (true);
		}
		
		if(allneutron == temp.gettotalneutron()){
			return (true);
		}
		
		else{
			return (false);
		}
	}
	
	//a derived hydrocarbon class
	class hydrocarbon extends molfinal{
	
		Scanner x = new Scanner(System.in);
		public double[][] coor;
		public String[] atomname;
		
		public hydrocarbon (String molname, int hydrogen, int carbon){
		
			hydrocarbonname = molname;
			count = hydrogen + carbon;
			double[][] coor = new double[count][3];
			String[] atomname = new String[count];
			
			for(int i=0; i<carbon; i++){
				atomname[i]="Carbon";
			}
			
			for(int i=hydrogren; i<count; i++){
				atomname[i]="Hydrogen";
			}
			
			for(int i=0; i<count; i++){
				System.out.println("Input the three coordinates.");
				coor[i][0]= x.nextDouble();
				coor[i][1]= x.nextDouble();
				coor[i][2]= x.nextDouble();
			}
			
			mass = hydrogen * 1.0079 + carbon * 12.0011;
		}
	}

	//alkane derived class
	class alkane extends hydrocarbon{
		public alkane(String mname, int c){
		//override hydrocarbon method
			super(mname, c, 2*c + 2);
		}
	}
}	