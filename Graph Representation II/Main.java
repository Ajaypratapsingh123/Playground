#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
int **graph,node,edge,f=0,sn,en,we;
char *dir;
dir=(char*)malloc(sizeof(char));
printf("Please enter the number of nodes in the graph\n");
scanf("%d",&node);
printf("Please enter the number of edges in the graph\n");
scanf("%d",&edge);
graph=(int**)malloc(sizeof(int*)*node);
for(int i=0;i<node;i++)
*(graph+i)=(int*)malloc(sizeof(int)*edge);
printf("Is the graph directed\n");
scanf("%s",dir);
if(strcmp(dir,"yes")==0)
    f=1;
for(int i=0;i<edge;i++){
printf("Enter the start node, end node and weight of edge no %d\n",i);
scanf("%d %d %d",&sn,&en,&we);
graph[sn][en]=we;
if(f==0)
graph[en][sn]=we;}
printf("Adjacency Matrix Representation:\n\n");
for(int i=0;i<node;i++){
    for(int j=0;j<edge;j++)
        printf("%d ",graph[i][j]);
    printf("\n");}
    printf("Adjacency List Representation:\n");
for(int i=0;i<node;i++)
{
    printf("Node %d is connected to the following nodes:\n",i);
    for(int j=0;j<edge;j++)
        if(graph[i][j]>0)
        printf("Node %d with edge weight %d\n",j,graph[i][j]);
        
}
return 0;
}