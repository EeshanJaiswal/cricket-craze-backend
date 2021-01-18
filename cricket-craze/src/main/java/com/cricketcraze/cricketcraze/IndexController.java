package com.cricketcraze.cricketcraze;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cricketcraze.player.model.Player;
import com.cricketcraze.player.model.PlayerForm;
import com.cricketcraze.player.service.impl.PlayerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        return "Cricket-Craze-Home";
    }

    // @Autowired
    // private PlayerServiceImpl playerServiceImpl;

    // @PostMapping(value = "/create", consumes = { "application/json", "application/XML" }, produces = {
    //         "application/json", "application/XML" })
    // public Object createPlayer(@RequestBody PlayerForm payload, HttpServletRequest request,
    //         HttpServletResponse response) throws Exception {
    //     try {
    //         return playerServiceImpl.createPlayer(new Player(payload));
    //     } catch (Exception e) {
    //         throw e;
    //     }
    // }

    // @GetMapping(value = "/getPlayer/{id}")
    // public Object findPlayer(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response)
    //         throws Exception {
    //     try {
    //         return playerServiceImpl.findPlayer(id);
    //     } catch (Exception e) {
    //         throw e;
    //     }
    // }

    @GetMapping(value = "/getPlayer")
    public Object findAllPlayer(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            // return playerServiceImpl.findAllPlayer();
            return "[{playerId:1,playerName:'Eeshan'},{playerId:2,playerName:'Vishwas'},{playerId:3,playerName:'Vikalp'},{playerId:4,playerName:'Kabir'}]";

        } catch (Exception e) {
            throw e;
        }
    }

    // @DeleteMapping(value = "/deletePlayer/{id}")
    // public ResponseEntity<String> deletePartnerProject(@PathVariable("id") Long id, HttpServletRequest request,
    //         HttpServletResponse response) throws Exception {
    //     try {
    //         playerServiceImpl.deletePlayer(id);
    //         return new ResponseEntity<>(HttpStatus.OK);
    //     } catch (Exception e) {
    //         throw e;
    //     }
    // }

}
