#version 430 core

layout(location = 1) in vec3 vPosition;
layout(location = 2) in vec2 vTextureCoords;

out vec2 textureCoords;

uniform mat4 model;
uniform mat4 view;
uniform mat4 projection;

void main(){
	gl_Position = projection * view * vec4(vPosition.x , 1.0f - vPosition.y , vPosition.z , 1.0f) ;
	textureCoords = vTextureCoords;
}