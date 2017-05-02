/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivelinkedlistsearch;

import java.util.Scanner;

/**
 * Creates a list of integers and prompts user to locate search term within a list
 *
 * @author Timothy Bradford
 */
public class RecursiveLinkedListSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new List<>();

        for (int i = 0; i < 10; i++) {
            list.insertAtFront(i);
        }
        System.out.print("Enter List search number: ");

        Boolean b = true;

        //Keep trying to get good input until the user gives it.
        while (b) {
            //Check for good data
            try {
                int searchTerm = new Scanner(System.in).nextInt();
                b = false;

                //Check for either null or value
                try {
                    System.out.println("We found: " + list.bradfordRecursiveSearch(searchTerm) + " in the List!!!");
                } catch (EmptyListException emptyListException) {//the list is empty nuthing can be found
                    emptyListException.printStackTrace();
                } catch (NullPointerException n) {//The list returned null.. The value cannot be found
                    System.out.println("No Results found");
                }
                //user entered something wrong
            } catch (Exception e) {// This will catch all bad input... 
                System.out.print("something went wrong? Try again!\n");
                System.out.print("Make sure you enter a whole number: ");
            }
        }
    }
}
