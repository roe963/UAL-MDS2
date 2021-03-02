import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-agregarcategoria`
 *
 * VistaAgregarcategoria element.
 *
 * @customElement
 * @polymer
 */
class VistaAgregarcategoria extends PolymerElement {

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
        return 'vista-agregarcategoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregarcategoria.is, VistaAgregarcategoria);
