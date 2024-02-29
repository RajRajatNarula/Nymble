package com.nymble.travelagency.Mapper;

import com.nymble.travelagency.Dto.PassengerDto;
import com.nymble.travelagency.Entities.Passenger;
import com.nymble.travelagency.Entities.TravelPackage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-30T03:51:15+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class PassengerMapperImpl implements PassengerMapper {

    @Override
    public PassengerDto mapPassengerToPassengerDto(Passenger passenger) {
        if ( passenger == null ) {
            return null;
        }

        PassengerDto passengerDto = new PassengerDto();

        passengerDto.setTravelPackageName( passengerTravelPackagePackageName( passenger ) );
        passengerDto.setPassengerNumber( passenger.getPassengerNumber() );
        passengerDto.setPassengerName( passenger.getPassengerName() );
        passengerDto.setMembership( passenger.getMembership() );
        passengerDto.setBalance( passenger.getBalance() );

        return passengerDto;
    }

    private String passengerTravelPackagePackageName(Passenger passenger) {
        if ( passenger == null ) {
            return null;
        }
        TravelPackage travelPackage = passenger.getTravelPackage();
        if ( travelPackage == null ) {
            return null;
        }
        String packageName = travelPackage.getPackageName();
        if ( packageName == null ) {
            return null;
        }
        return packageName;
    }
}
