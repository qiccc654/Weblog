import'@/assets/main.css'
import'animate.css'

import { createApp } from 'vue'
import App from '@/App.vue'
// 导入路由
import router from '@/router'
// 导入全局路由守卫
import '@/permission'
// 引入全局状态管理 Pinia
import pinia from '@/stores'
// 图片点击放大
import 'viewerjs/dist/viewer.css'
import VueViewer from 'v-viewer'

// 导入 Element Plus 图标
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
// 引入全局状态管理 Pinia
import { createPinia } from 'pinia'

import piniaPluginPersistedstate from 'pinia-plugin-persistedstate'

/* const pinia = createPinia()
//pinia持久化
pinia.use(piniaPluginPersistedstate) */
const app = createApp(App)
// 引入图标
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
// 应用路由
app.use(router)
// 应用 Pinia
app.use(pinia)
app.use(VueViewer)
app.mount('#app')