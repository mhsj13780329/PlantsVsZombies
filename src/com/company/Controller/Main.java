package com.company.Controller;

import com.company.Models.Menu;
import com.company.Models.NormalGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menuLocation = Menu.MAIN_MENU;
        //todo delete when complete
        NormalGame normalGame = null;
        Scanner scanner = new Scanner(System.in);
        String command;
        while(true){
            command = scanner.nextLine();
            String[] commandSplit = command.split(" ");
            if (menuLocation == Menu.DAY_AND_WATER &&  command.equals("show hand")){
                normalGame.showHand();
            }
            else if (menuLocation == Menu.DAY_AND_WATER &&  commandSplit[0].equals("select")){
                normalGame.select(commandSplit[1]);
            }
            else if (menuLocation == Menu.DAY_AND_WATER && commandSplit[0].equals("plant")){
                normalGame.plant(Integer.parseInt(commandSplit[1].split(",")[0] ), Integer.parseInt(commandSplit[1].split(",")[1]));
            }
            else if (menuLocation == Menu.DAY_AND_WATER && commandSplit[0].equals("remove")){
                normalGame.remove(Integer.parseInt(commandSplit[1].split(",")[0] ), Integer.parseInt(commandSplit[1].split(",")[1]));
            }
            else if (menuLocation == Menu.DAY_AND_WATER && command.equals("end turn")){
                normalGame.endTurn();
            }
            else if (menuLocation == Menu.DAY_AND_WATER && command.equals("show lawn")){
                normalGame.showLawn();
            }
        }
    }
}
