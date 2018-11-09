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
      System.out.println("user with the most likes = "+ maxId);
    }/*1107 缺少输出 可能以println的形式补完*/
    
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
    }/*1107 缺少输出 可能以println的形式补完*/
    
    public void getAverageLikesOfAllComments()/*Find Average number of likes per comment*/
    {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int sum = 0;
        int count = 0;
        for(Comment c : comments.values())
        {
            sum += c.getLikes();
            count ++;
        }
        
        System.out.println("Average Likes of All Comments = "+ sum/count);
    }
    
    public void postWithMostLikes() /*这是新的名字*/
    {
        Map<Integer, Integer> postsLikecount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        
        for(Post post:posts.values())
        {
            for(Comment c : post.getComments())
            {
                int likes = 0;
                if(postsLikecount.containsKey(post.getPostId()))
                {
                    likes = postsLikecount.get(post.getPostId());
                }
                likes += c.getLikes();
                postsLikecount.put(post.getPostId(), likes);
            }
        }
        
      int max = 0;
      int maxId = 0;
      for(int id : postsLikecount.keySet())
      {
          if(postsLikecount.get(id) > max)
          {
              max = postsLikecount.get(id);
              maxId = id;
          }
      }
      System.out.println("post with the most likes = "+ maxId);
    }
    public void postWithMostComments()
    { 
        Map<Integer, Integer> postsCommentCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        for(Post post:posts.values())
        {
            int maxComment = 0;
            if(postsCommentCount.containsKey(post.getPostId()))
            {
                maxComment = postsCommentCount.get(post.getPostId());
            }
            maxComment = post.getComments().size();
            postsCommentCount.put(post.getPostId(),maxComment);
        }
        
        int max = 0;
        int maxId = 0;
        for(int id : postsCommentCount.keySet())
        {
            if(postsCommentCount.get(id) > max)
            {
                max = postsCommentCount.get(id);
                maxId = id;
            }
        }
        
        System.out.println("user with the most likes = "+ maxId);
    }
}

