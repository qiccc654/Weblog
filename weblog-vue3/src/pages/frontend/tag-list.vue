<template>
	<Header></Header>

	<!-- 主内容区域 -->
	<main class="container max-w-screen-xl mx-auto p-4 px-6">
		<!-- grid 表格布局，分为 4 列 -->
		<div class="grid grid-cols-4 gap-7">
			<!-- 左边栏，占用 3 列 -->
			<div class="col-span-4 md:col-span-3 mb-3">
				<!-- 标签 -->
				<div v-if="tags.length > 0"
					class="w-full p-5 mb-3 bg-white border border-gray-200 rounded-lg dark:bg-gray-800 dark:border-gray-700">
					<!-- 标签标题 -->
					<h2 class="mb-2 font-bold text-gray-900 uppercase dark:text-white">标签</h2>
					<!-- 标签列表 -->
					<span v-for="(tag, index) in tags" :key="index" @click="goTagArticleListPage(tag.id, tag.name)" class="inline-block mb-1 cursor-pointer bg-green-100 text-green-800 text-xs font-medium mr-2 px-3 py-1 rounded-full
 rounded-full hover:bg-green-200 hover:text-green-900 dark:bg-green-900 dark:text-green-300">
						{{ tag.name }}
					</span>
				</div>
			</div>

			<!-- 右边侧边栏，占用一列 -->
			<aside class="col-span-4 md:col-span-1">
				<!-- 博主信息 -->
				<UserInfoCard></UserInfoCard>

				<!-- 分类 -->
				<CategoryListCard></CategoryListCard>
			</aside>
		</div>

	</main>

	<Footer></Footer>
</template>

<script setup>
import Header from '@/layouts/frontend/components/Header.vue'
import Footer from '@/layouts/frontend/components/Footer.vue'
import UserInfoCard from '@/layouts/frontend/components/UserInfoCard.vue'
import CategoryListCard from '@/layouts/frontend/components/CategoryListCard.vue'
import { getTagList } from '@/api/frontend/tag'
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()

// 所有标签
const tags = ref([])
getTagList().then((res) => {
    if (res.success) {
        tags.value = res.data
    }
})

// 跳转标签文章列表页
const goTagArticleListPage = (id, name) => {
    // 跳转时通过 query 携带参数（标签 ID、标签名称）
    router.push({path: '/tag/article/list', query: {id, name}})
}
</script>
