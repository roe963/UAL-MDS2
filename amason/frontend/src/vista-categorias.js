import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

class VistaCategorias extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>

`;
    }

    static get is() {
        return 'vista-categorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategorias.is, VistaCategorias);
