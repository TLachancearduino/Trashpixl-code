package trashpixl.trashpixl.useless

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

 //the package for this project



class OnCommandDontDie : CommandExecutor { //creating the class death and implementing the listener
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 189.0
        val y = -58.0
        val z = 278.0


        for (p in getServer().onlinePlayers) {
            if(p.world.environment == World.Environment.NORMAL){
            p.health = 20.0
            val w: World = p.world
            val to = Location(w, x, y, z) //move before for
            p.teleport(to)
            p.inventory.clear()
            }
            
        }

        return false

    }
}