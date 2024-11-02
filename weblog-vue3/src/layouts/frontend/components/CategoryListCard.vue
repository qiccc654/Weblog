<template>
	<div v-if="categories && categories.length > 0"
		class="w-full p-5 mb-3 bg-white border border-gray-200 rounded-lg dark:bg-gray-800 dark:border-gray-700">
		<!-- 分类标题 -->
		<h2 class="mb-2 font-bold text-gray-900 uppercase dark:text-white">分类</h2>
		<!-- 分类列表 -->
		<div
			class="text-sm font-medium text-gray-600 bg-white rounded-lg dark:bg-gray-700 dark:border-gray-600 dark:text-white">
			<a @click="goCategoryArticleListPage(category.id, category.name)" v-for="(category, index) in categories"
				:key="index"
				class="flex items-center w-full px-4 py-2 rounded-lg border-gray-200 cursor-pointer hover:bg-gray-100 hover:text-blue-700 dark:border-gray-600 dark:hover:bg-gray-600 dark:hover:text-white dark:focus:ring-gray-500 dark:focus:text-white">
				{{ category.name }}
			</a>
		</div>
	</div>
</template>

<script setup>
	import {
		getCategoryList
	} from '@/api/frontend/category'
	import {
		ref
	} from 'vue'
	import {
		useRouter
	} from 'vue-router'
	// 引入路由
	const router = useRouter()
	// 所有分类
	const categories = ref([])
	getCategoryList().then((res) => {
		if (res.success) {
			categories.value = res.data
		}
	})
	// 跳转分类文章列表页
	const goCategoryArticleListPage = (id, name) => {
		// 跳转时通过 query 携带参数（分类 ID、分类名称）
		router.push({
			path: '/category/article/list',
			query: {
				id,
				name
			}
		})
	}
</script>