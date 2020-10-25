package com.company.Model;

public class Bowler extends Player {
    public Bowler(String name,boolean bowler,String team_name){
        this.playerId = counter++;
        this.batsman = false;
        this.bowler = bowler;
        this.name = name;
        this.team_name = team_name;
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
