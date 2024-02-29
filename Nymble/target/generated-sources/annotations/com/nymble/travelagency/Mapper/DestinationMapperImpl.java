package com.nymble.travelagency.Mapper;

import com.nymble.travelagency.Dto.DestinationDto;
import com.nymble.travelagency.Entities.Destination;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-30T03:44:48+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class DestinationMapperImpl implements DestinationMapper {

    @Override
    public DestinationDto mapDestinationToDestinationDto(Destination destination) {
        if ( destination == null ) {
            return null;
        }

        DestinationDto destinationDto = new DestinationDto();

        return destinationDto;
    }

    @Override
    public Destination mapDestionationDtoToDestionation(DestinationDto destinationDto) {
        if ( destinationDto == null ) {
            return null;
        }

        Destination destination = new Destination();

        return destination;
    }
}
