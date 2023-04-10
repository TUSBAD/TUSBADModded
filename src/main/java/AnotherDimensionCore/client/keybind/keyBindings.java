package AnotherDimensionCore.client.keybind;

import org.lwjgl.glfw.GLFW;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.input.Input;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import net.minecraft.client.option.KeyBinding;




public class keyBindings {

    /*デフォルトがGキーのキーバインドを追加*/
    // public static KeyBinding AD_KEY_BINDINGS_G = 
    //     new KeyBinding("key.ad_G",InputUtil.Type.KEYSYM,GLFW.GLFW_KEY_G,"category.ad");



    public static void init(){

        /*KeyBindingHelperにGキーを登録*/
        //KeyBindingHelper.registerKeyBinding(HURE_KEY_BINDINGS_G);

        /*ここに、押したときの処理を書く 押された時に、client側に通知*/
        // while(HURE_KEY_BINDINGS_G.wasPressed()){
        //     ClientNetworks.sendPressGKey();
        // }
        }
}
