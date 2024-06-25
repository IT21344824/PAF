package com.pafassigment.PowerWorld.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entity representing a post in a social media context.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "workouts")
public class Workout {

    
    @Id
    private String id;

    @NotBlank(message = "User ID must not be empty")
    private String userId;

    private List<@NotBlank(message = "Image URL must not be empty") String> fileUrl_WO;

    @Size(max = 1500, message = "Description must not exceed 500 characters")
    private String description;

    private String message1;
    
    private String message2;

    private String message3;

    private LocalDateTime postedTime = LocalDateTime.now();

    private String postType;

    private User workoutedUser;

    private List<Comment_WO> comments;

    private List<LikeWorkOut> likes;


}
