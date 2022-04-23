package com.tree;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class ConstructTreeTest {

    @Test
    public void buildTreeTest(){
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        ConstructTree constructTree = new ConstructTree();

        Node rootNode = constructTree.buildTree(inorder, postorder);

        log.info("RootNode : {}", rootNode);
    }

}