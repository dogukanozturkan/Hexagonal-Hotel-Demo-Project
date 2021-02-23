package com.demohotel.hotelapi.adapters.room.rest;

import com.demohotel.hotelapi.common.rest.BaseController;
import com.demohotel.hotelapi.room.RoomFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/rooms")
public class RoomController extends BaseController {

    private final RoomFacade roomFacade;


}