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
      System.out.print("\n");
      System.out.println("user with the most likes = "+ maxId);
      System.out.print("\n");
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
        
        System.out.println("Average Likes of All Comments = "+ (double)sum/count);
        System.out.print("\n");
    }
    
    public void postWithMostLikedComment() /*Post with most liked comments*/
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
      System.out.print("\n");
    }
    
    public void postWithMostComments() /*Post with most comments.*/
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
        
        System.out.println("Post with most comments = "+ maxId);
        System.out.print("\n");
    }
    
    public void mostFiveInactiveUsersBasedOnPost ()/*Top 5 inactive users based on posts*/
    {
   
//        Map<Integer, Post> posts = DataStore.getInstance().getPostId();
//        List<Post> postList = new ArrayList<>(posts.values());
        Map<Integer, Integer> usersPostCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        
        for(Post post: posts.values())
        {
            int postCount = 0;
            
            if(usersPostCount.containsKey(post.getUserId()))
            {
                postCount = usersPostCount.get(post.getUserId());
            }
            postCount ++;
            usersPostCount.put(post.getUserId(), postCount);
        }
        
        /*Collections.sort(usersPostCount, new Comparator<Post>()             
        {
            @Override
            public int compare(User o1, User o2) {
            return o1.getUserId() - o2.getUserId();
            }
        });*/
        
        List<Map.Entry<Integer, Integer>> infoIds = new ArrayList<Map.Entry<Integer, Integer>>(usersPostCount.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() 
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
            {
		return o1.getValue()-o2.getValue();
            }
        });
        
        System.out.print("Top 5 inactive users based on posts: \n");
        for(int i =0; i<5 ;i ++)
        {
            String id = infoIds.get(i).toString();
            System.out.print(id + "  "+"\n");
        }
        System.out.print("\n");
    }

    public void mostFiveInactiveUsersBasedOnComment ()/*Top 5 inactive users based on comments*/
    {
   
//        Map<Integer, Post> posts = DataStore.getInstance().getPostId();
//        List<Post> postList = new ArrayList<>(posts.values());
        Map<Integer, Integer> usersCommentCount = new HashMap<>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        
        for(Comment comment: comments.values())
        {
            int commentCount = 0;
            
            if(usersCommentCount.containsKey(comment.getUserId()))
            {
                commentCount = usersCommentCount.get(comment.getUserId());
            }
            commentCount++;
            usersCommentCount.put(comment.getUserId(), commentCount);
        }
        
        /*Collections.sort(usersPostCount, new Comparator<Post>()             
        {
            @Override
            public int compare(User o1, User o2) {
            return o1.getUserId() - o2.getUserId();
            }
        });*/
        
        List<Map.Entry<Integer, Integer>> infoIds = new ArrayList<Map.Entry<Integer, Integer>>(usersCommentCount.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() 
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
            {
		return o1.getValue()-o2.getValue();
            }
        });
        
        System.out.print("Top 5 inactive users based on comments: \n");
        for(int i =0; i<5 ;i ++)
        {
            String id = infoIds.get(i).toString();
            System.out.print(id + "  "+"\n");
        }
        System.out.print("\n");
    }
    
    public void mostFiveInactiveUsersOverall ()/*Top 5 inactive users overall*/
    {
   
//        Map<Integer, Post> posts = DataStore.getInstance().getPostId();
//        List<Post> postList = new ArrayList<>(posts.values());
        Map<Integer, Integer> usersOverallCount = new HashMap<>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        
        for(Comment comment: comments.values())
        {
            int commentCount = 0;
            
            if(usersOverallCount.containsKey(comment.getUserId()))
            {
                commentCount = usersOverallCount.get(comment.getUserId());
            }
            commentCount++;
            usersOverallCount.put(comment.getUserId(), commentCount);
        }
        
        for(Post post: posts.values())
        {
            int postCount = 0;
            
            if(usersOverallCount.containsKey(post.getUserId()))
            {
                postCount = usersOverallCount.get(post.getUserId());
            }
            postCount++;
            usersOverallCount.put(post.getUserId(), postCount);
        }
        
        /*Calculate User with All Likes*/
        
        for(User user :users.values())
        {
            for(Comment c : user.getComments())
            {
                int likes = 0;
                if(usersOverallCount.containsKey(user.getId()))
                {
                    likes = usersOverallCount.get(user.getId());
                }
                likes += c.getLikes();
                usersOverallCount.put(user.getId(), likes);
            }
        }
        
        /*Collections.sort(usersPostCount, new Comparator<Post>()             
        {
            @Override
            public int compare(User o1, User o2) {
            return o1.getUserId() - o2.getUserId();
            }
        });*/
        
        List<Map.Entry<Integer, Integer>> infoIds = new ArrayList<Map.Entry<Integer, Integer>>(usersOverallCount.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() 
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
            {
		return o1.getValue()-o2.getValue();
            }
        });
        
        
        System.out.print("Top 5 inactive users overall: \n");
        for(int i =0; i<5 ;i ++)
        {
            String id = infoIds.get(i).toString();
            System.out.print(id + "  "+"\n");
        }
        System.out.print("\n");
    }
    
    public void mostFiveProactiveUsersOverall ()/*Top 5 proactive users overall*/
    {
   
//        Map<Integer, Post> posts = DataStore.getInstance().getPostId();
//        List<Post> postList = new ArrayList<>(posts.values());
        Map<Integer, Integer> usersOverallCount = new HashMap<>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        
        for(Comment comment: comments.values())
        {
            int commentCount = 0;
            
            if(usersOverallCount.containsKey(comment.getUserId()))
            {
                commentCount = usersOverallCount.get(comment.getUserId());
            }
            commentCount++;
            usersOverallCount.put(comment.getUserId(), commentCount);
        }
        
        for(Post post: posts.values())
        {
            int postCount = 0;
            
            if(usersOverallCount.containsKey(post.getUserId()))
            {
                postCount = usersOverallCount.get(post.getUserId());
            }
            postCount++;
            usersOverallCount.put(post.getUserId(), postCount);
        }
        
        /*Calculate User with All Likes*/
        
        for(User user :users.values())
        {
            for(Comment c : user.getComments())
            {
                int likes = 0;
                if(usersOverallCount.containsKey(user.getId()))
                {
                    likes = usersOverallCount.get(user.getId());
                }
                likes += c.getLikes();
                usersOverallCount.put(user.getId(), likes);
            }
        }
        
        /*Collections.sort(usersPostCount, new Comparator<Post>()             
        {
            @Override
            public int compare(User o1, User o2) {
            return o1.getUserId() - o2.getUserId();
            }
        });*/
        
        List<Map.Entry<Integer, Integer>> infoIds = new ArrayList<Map.Entry<Integer, Integer>>(usersOverallCount.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() 
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
            {
		return o2.getValue()-o1.getValue();
            }
        });
        
        System.out.print("Top 5 proactive users overall: \n");
        for(int i =0; i<5 ;i ++)
        {
            String id = infoIds.get(i).toString();
            System.out.print(id + "  "+"\n");
        }
        System.out.print("\n");
    }
}



