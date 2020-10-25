package com.company.Model;

public class Batsman extends Player{
    public Batsman(String name,boolean batsman,String team_name){
        this.playerId = counter;
        this.batsman = batsman;
        this.bowler = false;
        this.name = name;
        this.team_name = team_name;
        counter++;
    }

    public String getName(){
        return this.name;
    }
    public String getTeam(){
        return this.team_name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
