package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;
//Programmation dynamique ou programmation par reflexion
public class PresentationV2 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Scanner scanner = new Scanner(new File("config.txt"));
		//Instancier une class dynamiquement
		String daoClassName = scanner.nextLine();
		Class cDao = Class.forName(daoClassName);
		Object o1 = cDao.newInstance();
		IDao dao = (IDao)o1;
		System.out.println(dao.getValue());
		String metierClassName = scanner.nextLine();
		Class cMetier = Class.forName(metierClassName);
		//Recuperer une methode dynamique
		Method method = cMetier.getMethod("setiDao", IDao.class);//setiDao=nom method, Idao.class=parametre
		Object o2 = cMetier.newInstance();
		IMetier metier = (IMetier)o2;
		method.invoke(metier, dao);//equivaut metier.setDao(dao)
		System.out.println(metier.getCalcul());
	}

}
