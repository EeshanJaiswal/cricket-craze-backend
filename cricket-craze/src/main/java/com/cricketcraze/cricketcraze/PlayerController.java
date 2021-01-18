// // package com.cricketcraze.player.controller;
// package com.cricketcraze.cricketcraze;

// // import org.springframework.validation.annotation.Validated;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController

// @CrossOrigin(origins = "*")
// // @Validated
// public class PlayerController {

//     @RequestMapping("/player")    
//     public String getPlayer(){
//         return "Hi";
//     }

//     // @Autowired
//     // private PlayerServiceImpl playerServiceImpl;

//     // @PostMapping(value = "/create", consumes = { "application/json", "application/XML" }, produces = {
//     //         "application/json", "application/XML" })
//     // public Object createPlayer(@RequestBody PlayerForm payload, HttpServletRequest request,
//     //         HttpServletResponse response) throws Exception {
//     //     try {
//     //         return playerServiceImpl.createPlayer(new Player(payload));
//     //     } catch (Exception e) {
//     //         throw e;
//     //     }
//     // }

//     // @GetMapping(value = "/getPlayer/{id}")
//     // public Object findPlayer(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response)
//     //         throws Exception {
//     //     try {
//     //         return playerServiceImpl.findPlayer(id);
//     //     } catch (Exception e) {
//     //         throw e;
//     //     }
//     // }

//     // @GetMapping(value = "/getPlayer")
//     // public Object findAllPlayer(HttpServletRequest request, HttpServletResponse response) throws Exception {
//     //     try {
//     //         return playerServiceImpl.findAllPlayer();
//     //     } catch (Exception e) {
//     //         throw e;
//     //     }
//     // }

//     // @DeleteMapping(value = "/deletePlayer/{id}")
//     // public ResponseEntity<String> deletePartnerProject(@PathVariable("id") Long id, HttpServletRequest request,
//     //         HttpServletResponse response) throws Exception {
//     //     try {
//     //         playerServiceImpl.deletePlayer(id);
//     //         return new ResponseEntity<>(HttpStatus.OK);
//     //     } catch (Exception e) {
//     //         throw e;
//     //     }
//     // }
// }
