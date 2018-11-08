/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    
    
    public void userWithMostLikes()
    {
        Map<Integer, Integer> userLikecount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        
        for(User user :users.values())
        {
            for(Comment c : user.getComments())
            {
                int likes = 0;
                if(userLikecount.containsKey(user.getId()))
                {
                    likes = userLikecount.get(user.getId());
                }
                likes += c.getLikes();
                userLikecount.put(user.getId(), likes);
            }
        }
        
      int max = 0;
      int maxId = 0;
      for(int id : userLikecount.keySet())
      {
          if(userLikecount.get(id) > max)
          {
              max = userLikecount.get(id);
              maxId = id;
          }
      }
    }
    
    public void getFiveMostLikedComment()
    {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        Collections.sort(commentList, new Comparator<Comment>() 
        {
            @Override
            public int compare(Comment o1, Comment o2) {
            //so as to get decending list
            return o2.getLikes() - o1.getLikes();
            }
        });
    }
    
}
