package AnotherDimensionCore.client.network;

import net.fabricmc.AnotherDimensionCore.AnotherDimensionCoreMod;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.network.PacketByteBuf;

public class ClientNetworks{
    public static void init(){

    }

    //Gキーが押されたことをclient側に送信
    // public static void sendPressGKey(){
    //     ClientPlayNetworking.send(AnotherDimensionCoreMod.id("press_g_key"),PacketByteBufs.empty());
    // }
}