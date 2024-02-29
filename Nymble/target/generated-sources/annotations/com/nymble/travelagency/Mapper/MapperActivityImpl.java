package com.nymble.travelagency.Mapper;

import com.nymble.travelagency.Dto.ActivityDto;
import com.nymble.travelagency.Dto.ActivityLeft;
import com.nymble.travelagency.Entities.Activity;
import com.nymble.travelagency.Entities.Destination;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-30T03:51:15+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class MapperActivityImpl implements MapperActivity {

    @Override
    public ActivityDto mapActivityToActivityDto(Activity activity) {
        if ( activity == null ) {
            return null;
        }

        ActivityDto activityDto = new ActivityDto();

        Long destinationId = activityDestinationDestinationId( activity );
        if ( destinationId != null ) {
            activityDto.setDestinationId( destinationId );
        }
        activityDto.setActivityName( activity.getActivityName() );
        activityDto.setDescription( activity.getDescription() );
        activityDto.setActivityCost( activity.getActivityCost() );
        activityDto.setCapacity( activity.getCapacity() );

        return activityDto;
    }

    @Override
    public ActivityLeft mapActivityToActivityLeft(Activity activity) {
        if ( activity == null ) {
            return null;
        }

        ActivityLeft activityLeft = new ActivityLeft();

        activityLeft.setActivityName( activity.getActivityName() );
        activityLeft.setActivityCost( String.valueOf( activity.getActivityCost() ) );
        activityLeft.setDestination( activityDestinationDestinationName( activity ) );
        activityLeft.setSpacesLeft( String.valueOf( activity.getSlotsLeft() ) );

        return activityLeft;
    }

    private Long activityDestinationDestinationId(Activity activity) {
        if ( activity == null ) {
            return null;
        }
        Destination destination = activity.getDestination();
        if ( destination == null ) {
            return null;
        }
        Long destinationId = destination.getDestinationId();
        if ( destinationId == null ) {
            return null;
        }
        return destinationId;
    }

    private String activityDestinationDestinationName(Activity activity) {
        if ( activity == null ) {
            return null;
        }
        Destination destination = activity.getDestination();
        if ( destination == null ) {
            return null;
        }
        String destinationName = destination.getDestinationName();
        if ( destinationName == null ) {
            return null;
        }
        return destinationName;
    }
}
