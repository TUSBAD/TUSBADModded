package net.fabricmc.AnotherDimensionCore;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.scoreboard.ScoreboardObjective;

public class ServerNetworks {

    public static void init(){

        /*pathのキーが押された時の処理（この場合はGキー) */
        // ServerPlayNetworking.registerGlobalReceiver(AnotherDimensionCoreMod.id("press_g_key"), ((server,player,handler,buf,responseSender) -> {
        //     ScoreboardObjective scoreObject = player.getScoreboard().getObjective("hure");

        //     if(scoreObject != null){
        //         player.getScoreboard().getPlayerScore(player.getEntityName(), scoreObject).incrementScore(1);
        //     }
        // }));
    }
        
}
