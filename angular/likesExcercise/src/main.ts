  import {LikeComponent} from './likecomponent';
  
  
  let likeComp = new LikeComponent(10, false);
  likeComp.onClick();  
	console.log(`likeCount: ${likeComp.likeCount} , isSelected : ${likeComp.isSelected}`);