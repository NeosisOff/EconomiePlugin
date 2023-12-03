package me.minecraftserver.economie;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class Economie implements CommandExecutor {

    public static HashMap money = new HashMap<UUID, Integer>();
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player){

            Player player = (Player) sender;

            //* on verifie si l'argent du joueur est défini
            if(money.get(player.getUniqueId()) == null){
                //* si l'argent du joueur n'est pas defini alors son solde est egal a 0
                player.sendMessage("§6Solde Actuelle: §a0$");
            }
            else{
                //* si l'argent du joueur est defini alors on recupere le solde du joueur dans le HashMap et on lui affiche
                player.sendMessage("&6Solde Actuelle: §a" + money.get(player.getUniqueId()).toString() + "$");
            }
        }

        return false;
    }
}
