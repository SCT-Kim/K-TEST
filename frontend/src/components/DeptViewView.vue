<template>

    <v-data-table
        :headers="headers"
        :items="deptView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DeptViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            deptView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/deptViews'))

            temp.data._embedded.deptViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.deptView = temp.data._embedded.deptViews;
        },
        methods: {
        }
    }
</script>

