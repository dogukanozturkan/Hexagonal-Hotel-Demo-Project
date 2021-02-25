package com.demohotel.hotelapi.image.port;

import com.demohotel.hotelapi.common.Port;
import com.demohotel.hotelapi.image.command.CreateImage;
import com.demohotel.hotelapi.image.command.FindImage;
import com.demohotel.hotelapi.image.command.RemoveImage;
import com.demohotel.hotelapi.image.command.UpdateImage;
import com.demohotel.hotelapi.image.model.Image;

@Port
public interface ImagePort {

    String create(CreateImage createImage);

    String update(UpdateImage createImage);

    String remove(RemoveImage createImage);

    Image find(FindImage createImage);
}