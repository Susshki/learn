"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var likecomponent_1 = require("./likecomponent");
var likeComp = new likecomponent_1.LikeComponent(10, false);
likeComp.onClick();
console.log("likeCount: " + likeComp.likeCount + " , isSelected : " + likeComp.isSelected);
